package linkedListCodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Given a list of non-overlapping intervals sorted by their start time, insert a given interval at the valid position,
   merge all the overlapping intervals and return a list of mutually exclusive intervals.
   Example --
   		Input: Intervals = [{1,3}{5,7}{8,10}], newInterval = [{4,9}]
   		Output: [{1,3} {4,10}]
   		
 * Solution: 
 		   1. Skip and add intervals that come before new interval to result.
 		   2. Merge all intervals that overlap with new interval.
 		   3. Add the merged interval to result.
 		   4. Insert the remaining intervals to result.
 */

public class InsertInterval {
	
	static class Interval{
		
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
	
	public List<Interval> insert(List<Interval> intervals, Interval newInterval)
	{
		if(intervals == null || intervals.isEmpty())
			return intervals;
		List<Interval> result = new LinkedList<>();
		int i = 0;
		while(i<intervals.size() && intervals.get(i).end < newInterval.start)
		{
			result.add(intervals.get(i));
			i++;
		}
		
		while(i<intervals.size() && intervals.get(i).start <= newInterval.end)
		{
			Interval current = intervals.get(i);
			newInterval.start = Math.min(current.start, newInterval.start);
			newInterval.end = Math.max(current.end, newInterval.end);
			i++;
		}
		result.add(newInterval);
		while(i<intervals.size())
		{
			result.add(intervals.get(i));
			i++;
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertInterval ins = new InsertInterval();
		List<Interval> l = new ArrayList<>();
		l.add(new Interval(0,1));
		l.add(new Interval(3,5));
		l.add(new Interval(6,8));
		l.add(new Interval(9,10));
		System.out.println("Given Intervals:");
		for(Interval a : l)
		{
			System.out.print("{"+a.start +","+ a.end+"} ");
		}
		System.out.println();
		l = ins.insert(l, new Interval(2,6));
		System.out.println("Intervals after inserting new interval:");
		for(Interval a : l)
		{
			System.out.print("{"+a.start +","+ a.end+"} ");
		}

	}

}
