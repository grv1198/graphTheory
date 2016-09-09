/**
 * 
 */
package com.grv.graph;

/**
 * @author gaurav
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DijkstraAlgorithm{
    static int n=0;
    public static void main(String[] args) {
        /*. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        
        int q= sc.nextInt();
        for(int i=0;i<q;i++){
           
            n= sc.nextInt(); //no of nodes;
            int m= sc.nextInt(); //no of edges
            
            int[][] graph= new int[n][n];
          
            
            for(int k=0;k<m;k++){
                int p=sc.nextInt();
                int r=sc.nextInt();
                graph[p-1][r-1]= 6;
                graph[r-1][p-1]=6;
                
            
            }
        int s= sc.nextInt();
            dijkstra(graph, s);
            
            
                
        }
        
            
            
            
            
        
        } 
            
       
    

    
    public static int getminDistance(int dist[],boolean [] visited ){
        int min= Integer.MAX_VALUE;
        int minIndex=-1;
        
        for(int v=0;v<n;v++){
            
            if(visited[v]==false&&dist[v]<min){
                min=dist[v];
                minIndex=v;
            }
        }
        
        return minIndex;
    }
    
    public static void printDistances(int[] dist){
        
        
        for(int k:dist){
            if(k==Integer.MAX_VALUE) k=-1;
            if(k!=0){
                 System.out.print(k+" ");
            }
           
        }
        System.out.println();
    }
    
    public static void dijkstra(int graph[][] , int source){
        
        int dist[] = new int[n];
        
        boolean visited[]= new boolean[n];
        
        for(int v=0;v<n;v++){
            
            
            dist[v]= Integer.MAX_VALUE;
            visited[v]= false;
        }
        dist[source-1]=0;
        
        for(int count=0;count<n-1;count++){
            
            //int V=n;
            int u= getminDistance(dist, visited);
            
            
            if(u>=0){
            	 visited[u]=true;
                 
                 boolean flag= false;
                 for(int v=0;v<n;v++){
                     
                     if(graph[u][v]!=0) flag=true; //edge exists. dist[u]!=-1
                     if(visited[v]==false&&graph[u][v]!=0&&dist[u] != Integer.MAX_VALUE&&dist[u]+graph[u][v]<dist[v]){
                         dist[v]=dist[u]+graph[u][v];
                     }
                 }
                    if(flag== false) dist[u]=-1; 
                     
            	
            }
           
        }
        
        
       
        printDistances(dist);
        
    }
}