package Practice;

import java.util.ArrayList;
import java.util.List;

/**
 * write an optimized java code with time complexity O(n) for below program
 *
 * you are given an integer array with a domain {1,n} of size n.
 *     you need to return an array consisiting of numbers between 1 an n that afre missing from the array
 */
public class T17_TransUnion_MissingNumber {
	
	public static List<Integer> findMissingNumbers(int[] nums) {
		int n = nums.length;
		// Mark numbers as visited by converting the index corresponding to the number to negative
		for (int i = 0; i < n; i++)
		{
			int index = Math.abs(nums[i]) - 1;
			//System.out.println("index : "+index);
			if (nums[index] > 0)
			{
				nums[index] = -nums[index];
				System.out.println("nums[index] : "+nums[index]);
			}
		}
		// Collect numbers that were not marked
		List<Integer> missingNumbers = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			if (nums[i] > 0)
			{
				missingNumbers.add(i + 1);
			}
		}
		return missingNumbers;
	}
	
	public static void main(String[] args) {
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> result = findMissingNumbers(nums);
		System.out.println("Missing numbers: " + result);
	}
}
