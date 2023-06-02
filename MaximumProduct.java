package in.ineuron.assignment2;

import java.util.Arrays;

/**
 * Question 5: Given an integer array nums, find three numbers whose product is maximum and
 * return the maximum product.
 * 
 * Example 1: Input: nums = [1,2,3] Output: 6
 * 
 * @author Rajani N
 *
 */

public class MaximumProduct {

	private static int findMaxProduct(int[] nums) {
		Arrays.sort(nums);
		// consider triplets of first,second and last element and its product and
		// consider from the end to last 3 elements and its product then return the
		// maximum number
		return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
				nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		int maxProduct = findMaxProduct(nums);
		System.out.println("Maximum product is :" + maxProduct);

	}

}
