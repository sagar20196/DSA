package graphCodes;

/*
 * Breadth First Search - Visit every node in given undirected graph
 * 0-----1
   |	 |
   |	 | 
   3-----2-----4
 */

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends AdjacencyListRepresentation {

	public BreadthFirstSearch(int nodes)
	{
		super(nodes);
	}
	
	public void bfs(int s)
	{
		boolean[] visited = new boolean[V]; //we create boolean array to keep track of visited nodes
		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.offer(s);
		
		while(!q.isEmpty())
		{
			int u = q.poll();
			System.out.print(u+" ");
			for(int v : adj[u])
			{
				if(!visited[v])
				{
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreadthFirstSearch g = new BreadthFirstSearch(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		System.out.println("Breadth First Search traversal of an undirected graph:");
		g.bfs(0);
		

	}

}
