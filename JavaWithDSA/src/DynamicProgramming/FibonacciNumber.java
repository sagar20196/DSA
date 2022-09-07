package DynamicProgramming;

/*
 * Bottom Up Approach --
 * We try to solve smaller sub-problems first, use their solution to build on and arrive
   at solutions to bigger sub-problems.
 * It is also called as Tabulation Method.
 * The solution is build in a tabular form by using solutions of smaller sub-problems iteratively and generating
   solutions to bigger sub-problems.
 */

/*
 * Top Down Approach --
 * It is also called as Memorization.
 * We break the large problem into multiple sub-problems.
 * Each of the sub-problems are solved and solutions are remembered.
 * If the sub-problem is solved already, reuse the answer.
 * Else solve the sub-problem and store the result.
 * Thus, it memorizes the solution of the sub-problem to avoid recomputing the value if sub-problem is 
   encountered again.
 */

public class FibonacciNumber {

	//Get Fibonacci Number using Bottom Up Approach
	public int fib(int n)
	{
		int [] table = new int[n+1];
		table[0] = 0;
		table[1] = 1;
		for(int i = 2; i <= n; i++)
		{
			table[i] = table[i-1] + table[i-2];
		}
		return table[n];
	}
	
	//Get Fibonacci Number using Top Down Approach
	public int fib(int[] memo, int n)
	{
		if(memo[n]==0)
		{
			if(n<2)
			{
				memo[n] = n; // 0 and 1
			}
			else
			{
				int left = fib(memo, n-1);
				int right = fib(memo, n-2);
				memo[n] = left + right; //the current number is sum of its preceding two numbers
			}
		}
		return memo[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNumber fn = new FibonacciNumber();
		System.out.println("7th Fibonacci Number using Bottom Up Approach:\n"+fn.fib(7));
		System.out.println("6th Fibonacci number using Top Down Approach:\n"+fn.fib(new int[6+1], 6));
		//0,1,1,2,3,5,8,13.....

	}

}
