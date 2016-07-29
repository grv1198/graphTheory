
/*
 * Simple DAG using adjacency list
 */
package com.grv.graph;

import java.util.*;

public class Graph {

	
	private int v; // no of vertices in the graph
	List<Integer> adj[]; // adjacency list
	
	
	
	public Graph(int v){
		
		
		this.v=v;
		adj=new ArrayList[v];
		
		for(int i=0;i<v;i++)
			adj[i]=new ArrayList<Integer>();
	}
	
	
	public int getV() {
		return v;
	}


	public void setV(int v) {
		this.v = v;
	}


	public List<Integer>[] getAdj() {
		return adj;
	}


	public void setAdj(List<Integer>[] adj) {
		this.adj = adj;
	}


	public void addEdge(int v, int w){
		this.adj[v].add(w);
	}
}
