package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Netcracker Interview
public class T8_Netcracker_MergeIntervals {
	
	/**
	 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
	 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
	 * <p>
	 * Example 1:
	 * Input: intervals = [[1,3],[8,10],[15,18],[2,6]]
	 * Output: [[1,6],[8,10],[15,18]]
	 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
	 * <p>
	 * Example 2:
	 * Input: intervals = [[1,4],[4,5]]
	 * Output: [[1,5]]
	 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
	 * <p>
	 * Constraints:
	 * 1 <= intervals.length <= 10^4
	 * intervals[i].length == 2
	 * 0 <= starti <= endi <= 10^4
	 */
	
	public static int[][] merge(int[][] intervals) {
		// If there are no intervals or only one, return the input as is
		if (intervals.length <= 1) {
			return intervals;
		}
		
		// Sort intervals by start time
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		
		// List to hold merged intervals
		List<int[]> merged = new ArrayList<>();
		
		// Initialize with the first interval
		int[] currentInterval = intervals[0];
		merged.add(currentInterval);
		
		for (int[] interval : intervals) {
			int currentEnd = currentInterval[1];
			int nextStart = interval[0];
			int nextEnd = interval[1];
			
			// Check if intervals overlap
			if (currentEnd >= nextStart) {
				// Merge the intervals
				currentInterval[1] = Math.max(currentEnd, nextEnd);
			} else {
				// No overlap, add the next interval to the list
				currentInterval = interval;
				merged.add(currentInterval);
			}
		}
		
		// Convert list to 2D array
		return merged.toArray(new int[merged.size()][]);
	}
	
	public static void main(String[] args) {
		int[][] intervals1 = {{1, 3}, {8, 10}, {15, 18}, {2, 6}};
		int[][] intervals2 = {{1, 4}, {4, 5}};
		
		System.out.println("Merged Intervals 1: " + Arrays.deepToString(merge(intervals1)));
		System.out.println("Merged Intervals 2: " + Arrays.deepToString(merge(intervals2)));
	}
	
}
