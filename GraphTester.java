package com.grv.graph;

public class GraphTester {
	
	
	
	public static void main(String args[]){
		
		Graph g=new Graph(4);
		g.addEdge(0,1);
		g.addEdge(0, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 3);
		
		DFS dfs= new DFS();
		System.out.println("DEPTH FIRST SEARCH TRAVERSAL OF INPUT GRAPH ");
		dfs.printDFS(2, g);
		
		
		
		System.out.println();
		System.out.println("***************************************");
		
		 System.out.println("TOPOLOGICAL SORT OF GIVEN GRAPH IS ");
		 
		Graph g2= new Graph(6);
		g2.addEdge(5, 2);
	    g2.addEdge(5, 0);
	    g2.addEdge(4, 0);
	    g2.addEdge(4, 1);
	    g2.addEdge(2, 3);
	    g2.addEdge(3, 1);
		
		TopologicalSort tpSort= new TopologicalSort();
		tpSort.topologicalSort(g2);
	}
	

}
