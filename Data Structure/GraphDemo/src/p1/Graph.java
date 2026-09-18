package p1;

import java.util.Set;

public class Graph
{
	
 Map<String,List<String>> adjlist;
 
 Graph()
 {
	 
	 adjlist = new HashMap();
 }
 
 void insertEdge(String v1,String v2)
 {
	 
	 adjlist.putIfAbsent(v1,new ArrayList());
	 adjlist.get(v1).add(v2);
	 adjlist.putIfAbsent(v2,new ArrayList());
	 adjlist.get(v2).add(v1);
 }
 
 
 void display()
 {
	 
	 Set<String> kset = adjlist.keySet();
	 for(String v: kset)
	 {
		 
		 System.out.println(v + " "+adjlist.get(v));
	 }
 }
 
 
 void dfs(String start)
 {
	 
	 Set<String>visited = new HashSet();
	 dfs_traverse(start,visited);
 }
 
 
 void dfs_traverse(String s,Set<String>visited)
 {
	 
	 System.out.println(s);
	 visited.add(s);
	 
	 for(int i= 0;i<adjlist.get(s).size();i++)
	 {
		 
		 String ad = adjlist.get(s).get(i);
		 if(!visited.contains(ad))
			 dfs_traverse(ad,visited);
	 }
	 
	 
	 
 }
 
 
 void bfs (String start)
 {
	 Set<String> visited = new HashSet();
 }
	
	
}
