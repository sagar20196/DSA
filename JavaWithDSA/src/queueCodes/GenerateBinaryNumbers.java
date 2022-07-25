//Example :       	1
//              +0/	  \+1		=> Appending 0 and 1 to generate binary numbers from every generated binary
//			   10	    11		   number and so on.....
//          +0/  \+1 +0/  \+1
//         100   101 110  111

package queueCodes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
	
	//generating binary numbers until given number
	public String[] generateBinaryNumbers(int n)
	{
		String[] result = new String[n];
		Queue<String> q = new LinkedList<>();
		q.offer("1"); // offer function push element into queue
		for (int i = 0; i < n; i++) 
		{
			result[i] = q.poll();	//poll function popped element from queue and push it into result array
			String n1 = result[i]+"0";
			String n2 = result[i]+"1";
			q.offer(n1);
			q.offer(n2);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateBinaryNumbers bn = new GenerateBinaryNumbers();
		String[] str = bn.generateBinaryNumbers(10);
		System.out.println("Generated Binary numbers are:\n"+Arrays.toString(str));

	}

}
