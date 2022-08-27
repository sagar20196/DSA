package graphCodes;

import java.util.LinkedList;

//Adjacency List Representation of an undirected graph using array of Linked List
public class AdjacencyListRepresentation {
	
	protected LinkedList<Integer>[] adj; // array of Linked List
	protected int V; //number of vertices 
	protected int E; //number of edges
	
	public AdjacencyListRepresentation(int nodes)
	{
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v = 0; v < V; v++)
		{
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v)
	{
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges "+"\n");
		for(int v =0; v < V; v++)
		{
			sb.append(v + ": ");
			for(int w : adj[v])
			{
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjacencyListRepresentation al = new AdjacencyListRepresentation(4);
		al.addEdge(0, 1);
		al.addEdge(1, 2);
		al.addEdge(2, 3);
		al.addEdge(3, 0);
		System.out.println("Adjacency List Representation of an undirected graph using array of Linked List:\n"+al);

	}

}
