package linkedListCodes;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * Interval --
 * An interval is a range represented by two numbers like(5,8). 
 * The two numbers are termed as - start and end.
 * Example - Time interval in tasks or jobs -
 * a=>(1,3), b=>(4,5), c=>(8,10) and d=>(9,11)
 * 
 * Overlapping Intervals --
 * Relationship between two intervals a and b
   1. a and b do not overlap.
   2. a and b overlap, b ends after a.
   3. a completely overlaps b.
   4. a and b overlap, a ends after b.
   5. b completely overlaps a.
 */

/*
 * Q:- Given a list of intervals, merge all the overlapping intervals and return a list of non-overlapping intervals.
 * Example --
 * Input: Intervals = [{2,6}, {1,3}, {8,10}]
 * Output: [{1,6}, {8,10}]
 * 
 * Solution:
 * 		1. Sort the intervals based on start time. (a.start<=b.start)
 * 		2. c.start = a.start
 * 		3. c.end = Math.max(a.end, b.end);
 * 		4. Repeat for all overlapping intervals.
 */

public class OverlappingInterval {
	
	static class Interval
	{
		int start = 0;
		int end = 0;
		
		Interval()
		{
			start = 0;
			end = 0;
		}
		Interval(int s, int e)
		{
			start = s;
			end = e;
		}
	}
	
	public List<Interval> merge(List<Interval> intervals)
	{
		if(intervals.size()<2)
			return intervals;
		intervals.sort(Comparator.comparingInt(in->in.start)); //use to sort intervals from starting point
		List<Interval> result = new LinkedList<>();
		Interval first = intervals.get(0); //first interval 
		int start = first.start;
		int end = first.end;
		for(int i=1; i<intervals.size();i++)
		{
			Interval current = intervals.get(i);
			if(current.start<=end)
			{
				end = Math.max(current.end, end);
			}
			else
			{
				result.add(new Interval(start,end));
				start = current.start;
				end = current.end;
			}
		}
		result.add(new Interval(start,end)); //add the last interval
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverlappingInterval ol = new OverlappingInterval();
		List<Interval> i = new ArrayList<>();
		i.add(new Interval(2,6));
		i.add(new Interval(1,3));
		i.add(new Interval(8,10));
		System.out.println("Given Intervals:");
		for(Interval a : i)
		{
			System.out.print("{"+a.start +","+ a.end+"} ");
		}
		System.out.println();
		i = ol.merge(i);
		System.out.println("Overlapping intervals after merging:");
		for(Interval a : i)
		{
			System.out.print("{"+a.start +","+ a.end+"} ");
		}

	}

}
