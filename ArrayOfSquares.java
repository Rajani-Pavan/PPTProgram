package in.ineuron.assignment4;

import java.util.Arrays;

/**
 * 
 * Question 6 
 * Given an integer array nums sorted in non-decreasing order, return
 * an array of the squares of each number sorted in non-decreasing order.
 * 
 * Example 1:
 * 
 * Input: nums = [-4,-1,0,3,10]
 * 
 * Output: [0,1,9,16,100]
 * 
 * Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting,
 * it becomes [0,1,9,16,100]
 * 
 * @author Pavan
 *
 */

public class ArrayOfSquares {

	private static void findSquareOfArrayAndSort(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}

		System.out.println("Sorted Array after square:");
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] nums = { -4, -1, 0, 3, 10 };
		findSquareOfArrayAndSort(nums);
	}

}
