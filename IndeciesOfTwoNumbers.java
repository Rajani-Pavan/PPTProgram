package in.ineuron.assignment;

/**
 * Q1. Given an array of integers nums and an integer target, return indices of
 * the two numbers such that they add up to target. You may assume that each
 * input would have exactly one solution, and you may not use the same element
 * twice. You can return the answer in any order. Example: Input: nums =
 * [2,7,11,15], target = 9 Output0 [0,1] Explanation: Because nums[0] + nums[1]
 * == 9, we return [0, 1]
 * 
 * @author Rajani N
 *
 */

public class IndeciesOfTwoNumbers {
	/* returns indices of two numbers which is equal to target */
	private static int[] indicesOfTwoSum(int[] nums, int target) {

		int[] indecies = { -1, -1 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					indecies[0] = i;
					indecies[1] = j;
					break;
				}
			}
		}
		return indecies;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] indecies = indicesOfTwoSum(nums, target);

		/* prints indices of two numbers present in the array */
		System.out.println("Indices of Sum of two numbers equal to :"+target);
		for (int i = 0; i < indecies.length; i++)
			System.out.print(indecies[i] + " ");

	}

}
