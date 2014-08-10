//recurse method for Graph

import java.util.*;

public class Graph1{
	/* data structure used to represent a graph */

	int[][] ajdMatrix;
	int rootNode = 0;
	int NNodes;

	public Graph1(int n){		// there are n nodes
		NNodes = n;
		adjMatrix = new int[n][n];
		visited = new boolean[n];
	}

	public Graph1(int[][] mat){
		NNodes = mat.length;
		adjMatrix = int[NNodes][NNodes];
		visited = new boolean[NNodes];

		for(int i=0; i<NNodes; i++){
			for(int j=0; j<NNodes; j++){
				adjMatrix[i][j] = mat[i][j];	
			}
		}
	}

	public void dfs(int i){				// depth first search
		int j;

		visited[i] = true;

		printNode(i);

		for(j=0; j<NNodes; j++){
			if(adjMatrix[i][j]>0 && !visited[j]){
				dfs(j);
			}
		}
	}

	public void clearVisited(){
		for(int i=0; i<visited.length; i++)
			visited[i] = false;
	}

	public void printNode(int i){
		System.out.println(n);
	}
}
