package DynamicProgramming;

/*
 * Bottom Up Approach --
 * We try to solve smaller sub-problems first, use their solution to build on and arrive
   at solutions to bigger sub-problems.
 * It is also called as Tabulation Method.
 * The solution is build in a tabular form by using solutions of smaller sub-problems iteratively and generating
   solutions to bigger sub-problems.
 */

//Fibonacci Number using Bottom Up Approach
public class FibonacciNumber {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNumber fn = new FibonacciNumber();
		System.out.println("Fibonacci Number using Bottom Up Approach:\n"+fn.fib(7));

	}

}
