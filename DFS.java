package com.grv.graph;

import java.util.Iterator;

public class DFS {
	
	
	public void DFSUtil(int v, boolean visited[], Graph g){
		
		
		
		visited[v]=true;
		System.out.print(v+"-->");
		
		
		// recur thru all adjacent vertices of current vertex
		
		Iterator<Integer> it= g.adj[v].iterator();
		
		while(it.hasNext()){
			
			
			int curr_element=(Integer) it.next();
			
			if(!visited[curr_element])
				DFSUtil(curr_element, visited, g);
		}
		
	}
	
	
	public void printDFS(int v, Graph g){
		
		
		// mark all vertices as non visted
		
		boolean visited[]= new boolean[g.getV()];
		for(int i=0;i<g.getV();i++)
			visited[i]=false;
		
		
		// RECURSIVELY CALL DFSUtil
		
		DFSUtil(v, visited, g);
	}

}
