class Vertex{
	public char label;
	public boolean wasVisited;

	public Vertex(char label, boolean wasVisited){
		this.label = label;
		this.wasVisited = false;
	}
}

class Graph{
	private int[][] adjMatrix;
	private Vertex vertexList[];
	private int nVerts;
	Stack<Integer> stack = new Stack<Integer>();

	public Graph(int Max_Size){								//constructor 1: given the Max_Size which is the node number of the graph
		adjMatrix = new int[Max_Size][Max_Size];
		vertexList = new Vertex[Max_Size];
		nVerts = 0;
	}

	public Graph(int[][] mat){								//constructor 2: give the connection matrix which shows us the connecting relationship between nodes
		int Max_Size = mat.length;
		adjMatrix = new int[Max_Size][Max_Size];
		vertexList = new Vertex[Max_Size];

		for(int i=0; i<Max_Size; i++){
			for(int j=0; j<Max_Size; j++){
				adjMatrix[i][j] = mat[i][j];
			}
		}
	}

	public void dfs(){
		vertexList[0].wasVisited = true;
		stack.push(0);
		displayVertex(0);

		while(!stack.isEmpty()){
			int v = getAdjUnvisitedVertex(theStack.peek());
			if(v == -1){
				stack.pop();
			}else{
				vertexList[v].wasVisited = true;
				stack.push(v);
				displayVertex(v);
			}
		}//end while
	}

	//the stack is empty, so we are done
	for(int j=0; j<Max_Size; j++){
		vertexList[j].wasVisited = false;
	}

	public int getAdjUnvisitedVertex(int v){
		for(int j=0; j<Max_Size; j++){
			if(adjMatrix[v][j]==1 && vertexList[j]==false)
				return j;
			else
				return -1;
		}
	}

	public void displayVertex(int v){
		System.out.println(vertexList[v].label);
	}
}