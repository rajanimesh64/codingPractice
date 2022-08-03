package coding;

import java.util.ArrayList;
import java.util.List;

public class RoadsandLib {
	public static int dfs(int node,boolean[] vis,List<List<Integer>> adj){
        int nodes=1;
        vis[node]=true;
        for (Integer i: adj.get(node)) {
            if(vis[i]==false){
                nodes+=dfs(i, vis, adj);  
            }   
        }
        return nodes;
    }
	
	public static int roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> cities) {
	    // Write your code here
	    boolean[] vis= new boolean[n+1];
	    List<List<Integer>> adj= new ArrayList<>();
	        for(int i=0;i<=n;i++){
	            adj.add(new ArrayList<Integer>());
	        }
	        for (List<Integer> l : cities) {
	            adj.get(l.get(0)).add(l.get(1));
	            adj.get(l.get(1)).add(l.get(0));
	        }
	        if(c_road>c_lib){
	            return n*c_lib;
	        }else{
	            int cost=0;
	        for(int i=1;i<=n;i++){
	            if(vis[i]==false){
	               int tmp=dfs(i, vis, adj);
	               if(tmp>1){
	                   cost+=(((tmp-1)*c_road)+c_lib);
	               }else{
	                   cost+=c_lib;
	               }
	               
	            }
	        }
	        return cost;}
	        
	        
	        
	        
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> cities= new ArrayList<>();
        for(int i=0;i<=2;i++){
            cities.add(new ArrayList<Integer>());
        }
		cities.get(0).add(1);
		cities.get(0).add(3);
		cities.get(1).add(1);
		cities.get(1).add(4);
		cities.get(2).add(1);
		cities.get(2).add(2);
		System.out.println(roadsAndLibraries(5, 6, 1, cities));

	}

}
