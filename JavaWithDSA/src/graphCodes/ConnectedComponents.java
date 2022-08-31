package graphCodes;

/*
 *  0----1
 *  |
 *  |
 *  3     , 2-----4  ,   5   
 *  Suppose these are three components and their names 0,3,1 comes in componentId 0 , 2 and 4 comes in componentId
    1 and  5 comes in componentId 2.
 * Now our task is 1. Count no. of Connected components
 * 				   2. Return True/False for a query (x,y) are connected or not
 */

public class ConnectedComponents extends AdjacencyListRepresentation{
	
	public ConnectedComponents(int nodes)
	{
		super(nodes);
	}
	
	int[] compId = new int[V]; //Here compId is used to represent connected components like 0,1,3 is comes 
	   						   //under compId 1 and so on for other connected components
	int count = 0; //and count indicates that all connected components visited completely and then it increases
	public void dfs()
	{
		boolean[] visited = new boolean[V];
		
		for(int v=0; v<V; v++) 
		{
			if(!visited[v])
			{
				dfs(v,visited,compId,count);
				count++;
			}
		}
	}
	
	public void dfs(int v, boolean[] visited, int[] compId, int count)
	{
		visited[v] = true;
		compId[v] = count;
		for(int w : adj[v])
		{
			if(!visited[w])
			{
				dfs(w,visited,compId,count);
			}
		}
	}
	
	public int getCountConnectedComponents()
	{
		return count;
	}
	
	public boolean isConnected(int x, int y)
	{
		return compId[x]==compId[y];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectedComponents cc = new ConnectedComponents(7);
		cc.addEdge(0, 3);
		cc.addEdge(0, 1);
		cc.addEdge(2, 4);
		cc.addEdge(5, 6);
		System.out.println("Number of connected components in the given undirected graph:");
		cc.dfs();
		System.out.println(cc.getCountConnectedComponents());
		System.out.println("Is given components 0 and 2 connected with each other:");
		System.out.println(cc.isConnected(0, 2));
		System.out.println("Is given components 1 and 3 connected with each other:");
		System.out.println(cc.isConnected(1, 3));

	}

}
