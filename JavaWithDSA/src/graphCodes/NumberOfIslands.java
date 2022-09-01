package graphCodes;

/*
 * Number of Islands is similar to Connected Components in an Undirected Graph.
 * Q:- Given an m x n 2D binary grid, which represents a map of '1's(land) and '0's(water), return the number of
 	   islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or
 	   vertically. You may assume all four edges of the grid are all surrounded by water.
 * Input -
 * 			1 1 0 0
            1 0 0 0
            0 0 1 0
            0 0 0 1
   Output - 3
 */

public class NumberOfIslands {
	
	static int numOfIslands = 0;
	public static int numIslands(char[][] grid)
	{
		int m = grid.length;
		int n = grid[0].length;
		boolean[][] visited = new boolean[m][n];
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if(!visited[i][j] && grid[i][j]=='1')
				{
					dfs(grid,i,j,visited);
					numOfIslands++;
				}
			}
		}
		return numOfIslands;
	}
	
	public static void dfs(char[][] grid, int row, int col, boolean[][] visited)
	{
		if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || visited[row][col] || grid[row][col]=='0')
		{
			return;
		}
		visited[row][col] = true;
		dfs(grid,row,col-1,visited); //go left
		dfs(grid,row-1,col,visited); //go up
		dfs(grid,row,col+1,visited); //go right
		dfs(grid,row+1,col,visited); //go down
	}
	
	public static int getNumIslands()
	{
		return numOfIslands;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = {
				{'1','1','0','0'},  
				{'1','0','0','0'},
				{'0','0','1','0'},
				{'0','0','0','1'}
		};
		numIslands(grid);
		System.out.println("Number of Islands which is surrounded by water:\n"+getNumIslands());

	}

}
