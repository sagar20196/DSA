package graphCodes;

/*
 * Its a non-linear data structure used for storing data.
 * It is a set of vertices and a collection of edges that connects a pair of vertices.
 * Applications - Social Network, Web Content over the Internet
 * Graphs help us implement Social Networking sites such as Facebook, Twitter etc and also help us organize Web
   content over the Internet.
 * Names of people represent vertices of Graph and Webpages such as google.com, udemy.com etc represent vertices 
   of Graph.
 * A Link between two webpages and Friendship between two people can be represented as an Edge of Graph.
 * Undirected Graph - Which doesn't have any direction is called undirected graph.
 	
 	0------1
 	|      |
 	|      |
 	3------2
 	Adjacency Matrix Representation of an Undirected Graph.
 
 */

public class Graph {
	
	protected int V; //number of vertices in Graph
	protected int E; //number of edges in Graph
	protected int[][] adjMatrix;
	
	public Graph(int nodes)
	{
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int u, int v)
	{
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1; //because it is an undirected graph
		E++;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges "+"\n");
		for(int v =0; v < V; v++)
		{
			sb.append(v + ": ");
			for(int w : adjMatrix[v])
			{
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		System.out.println("Adjacency Matrix Representation of an Undirected Graph:");
		System.out.println(g);

	}

}
