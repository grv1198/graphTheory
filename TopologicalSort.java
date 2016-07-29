package com.grv.graph;

import java.util.Iterator;
import java.util.Stack;

public class TopologicalSort {
	
	
	public void topologicalSortUtil(int v, boolean visited[],Stack<Integer> stack,  Graph g){
		
		
		visited[v]= true;
		//System.out.print(v+"-->");
		
		
		// recur through each adjacent vertex of current vertex
		
		Iterator<Integer> it= g.adj[v].iterator();
		
		while(it.hasNext()){
			int current_vertex= (Integer)it.next();
			if(!visited[current_vertex])
				topologicalSortUtil(current_vertex, visited,stack, g);
			
			
		}
		
		stack.push(v);
		
		
		
	}
	
	
	
 public void topologicalSort(Graph g){
	 
	 
	 Stack<Integer> stack = new  Stack<Integer>();
	 boolean visited[]=new boolean[g.getV()];
	 for(int i=0;i<g.getV();i++){
		 visited[i]= false;
	 }
	 
	 for(int i=0;i<g.getV();i++){
		 if(!visited[i]){
	 topologicalSortUtil(i, visited, stack, g);
	 }
	 }
	// print the topological sort for the graph by poping out from stack
	 while(!stack.isEmpty()){
		 System.out.print(stack.peek()+"==>");
		 
		 stack.pop();
	 }
 }
	

}
