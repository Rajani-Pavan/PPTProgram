package in.ineuron.assignment;

/**
 * Q6.Given an integer array nums, return true if any value appears at least
 * twice in the array, and return false if every element is distinct.
 * 
 * Example 1: Input: nums = [1,2,3,1]
 * 
 * Output: true
 * 
 * 
 * @author Rajani N
 *
 */

public class FindDuplicateElement {

	private static boolean isDuplicate(int[] nums) {

		/*
		 * traversal of array and compare each elements for equality to check for
		 * duplicates (2 pointer approach)
		 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };
		if (isDuplicate(nums))
			System.out.print("Array has duplicate elements");
		else
			System.out.println("Array has distinct elements");
	}

}
