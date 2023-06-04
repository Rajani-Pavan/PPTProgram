package in.ineuron.assignment3;

import java.util.Arrays;

/**
 * Given an integer array nums of length n and an integer target, find three
 * integers in nums such that the sum is closest to the target. Return the sum
 * of the three integers.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Example 1: Input: nums = [-1,2,1,-4], target = 1 Output: 2
 * 
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * @author Rajani N
 *
 */
public class SumCloseToTarget {

	private static int findSumCloseToTarget(int[] nums, int target) {
		int sum = Integer.MAX_VALUE;
		System.out.println(target - sum);
		// sort the given array nums
		Arrays.sort(nums);
		// traverse the array from the beginning using 3 pointer approach
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (Math.abs(target - sum) > Math.abs(target - (nums[i] + nums[j] + nums[k])))
						sum = nums[i] + nums[j] + nums[k];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] nums = { -1, 2, 1, -4 }; // -4,-1,1,2
		int target = 1;
		int sum = findSumCloseToTarget(nums, target);
		System.out.println("Closest sum of 3 integers for the given target " + target + " is :" + sum);

	}

}
