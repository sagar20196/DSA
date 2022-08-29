package graphCodes;

import java.util.Stack;

public class DepthFirstSearch extends AdjacencyListRepresentation {
	
	public DepthFirstSearch(int nodes)
	{
		super(nodes);
	}
	
	//Iterative Depth First Search traversal of an undirected graph
	public void dfs(int s)
	{
		boolean[] visited = new boolean[V];
		Stack<Integer> stk = new Stack<>();
		stk.push(s);
		while(!stk.isEmpty())
		{
			int u = stk.pop();
			if(!visited[u])
			{
				visited[u] = true;
				System.out.print(u+" ");
				for(int v : adj[u])
				{
					if(!visited[v])
					{
						stk.push(v);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepthFirstSearch d = new DepthFirstSearch(5);
		d.addEdge(0, 1);
		d.addEdge(1, 2);
		d.addEdge(2, 3);
		d.addEdge(3, 0);
		d.addEdge(2, 4);
		System.out.println("Depth First Search traversal of an undirected graph using Iteration:");
		d.dfs(0);

	}

}
