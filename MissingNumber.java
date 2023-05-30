package in.ineuron.assignment;

/**
 * Q8.You have a set of integers s, which originally contains all the numbers
 * from 1 to n. Unfortunately, due to some error, one of the numbers in s got
 * duplicated to another number in the set, which results in repetition of one
 * number and loss of another number.
 * 
 * You are given an integer array nums representing the data status of this set
 * after the error.
 * 
 * Find the number that occurs twice and the number that is missing and return
 * them in the form of an array.
 * 
 * Example 1: Input: nums = [1,2,2,4] Output: [2,3]
 * 
 * 
 * @author Rajani N
 *
 */

public class MissingNumber {

	private static int[] findMissingNumber(int[] nums) {

		int[] result = { -1, -1 };
		/*
		 * traversal of array and compare each elements (2 pointer approach) if there is
		 * duplicate element then add that element to resulting array then add +1 to its
		 * previous element to find the next number in the series then return the
		 * resulting array
		 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					result[0] = nums[i];
					result[1] = nums[j - 1] + 1;
					return result;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] nums = {2,2};
		nums = findMissingNumber(nums);
		System.out.println("Repeated number and missing numbers shown respectively:");
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}
}
