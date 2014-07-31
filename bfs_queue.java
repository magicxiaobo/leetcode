public void bfs(){
	Queue<Integer> q = new LinkedList<Integer>();
	q.add(this.rootNode);
	printNode(this.rootNode);
	rootNode.visited = true;

	while(!q.isEmpty()){
		Node n = q.removeFirst();
		Node child = null;
		while(child = getUnvisitedChildNode(n) !=null){
			child.visited = true;
			printNode(child);
			q.add(child);
		}
	}
	clearNodes();
}
