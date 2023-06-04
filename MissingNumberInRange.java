package in.ineuron.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Question 7 You are given an inclusive range [lower, upper] and a sorted
 * unique integer array nums, where all elements are within the inclusive range.
 * 
 * A number x is considered missing if x is in the range [lower, upper] and x is
 * not in nums.
 * 
 * Return the shortest sorted list of ranges that exactly covers all the missing
 * numbers. That is, no element of nums is included in any of the ranges, and
 * each missing number is covered by one of the ranges.
 * 
 * Example 1: Input: nums = [0,1,3,50,75], lower = 0, upper = 99 Output:
 * [[2,2],[4,49],[51,74],[76,99]]
 * 
 * Explanation: The ranges are: [2,2] [4,49] [51,74] [76,99]
 * 
 * @author Rajani N
 *
 */
public class MissingNumberInRange {

	public static void main(String[] args) {
		int up = 99;
		int low = 0;
		int[] nums = { 0, 1, 3, 50, 75 };
		findSmallestRange(nums, low, up);
	}

	private static void findSmallestRange(int[] nums, int low, int up) {

		List<Integer> result = new ArrayList<>();
		if (low < up) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] >= low && nums[i] <= up) {
					for (int j = i + 1; j < nums.length; j++) {
						if (nums[i] < nums[j])
							if (nums[j] == nums[i] + 1) {
								break;
							} else {
								result.add(nums[i] + 1);
								result.add(nums[j] - 1);
								break;
							}

					}
				}
			}
		}
		result.add(nums[nums.length-1]+1);
		result.add(up);
		System.out.println("smallest ranges are:"+result);
		
	}
}