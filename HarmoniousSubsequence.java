package in.ineuron.assignment2;

/**
 * We define a harmonious array as an array where the difference between its
 * maximum value and its minimum value is exactly 1.
 * 
 * Given an integer array nums, return the length of its longest harmonious
 * subsequence among all its possible subsequences.
 * 
 * A subsequence of an array is a sequence that can be derived from the array by
 * deleting some or no elements without changing the order of the remaining
 * elements.
 * 
 * Example 1: Input: nums = [1,3,2,2,5,2,3,7] Output: 5
 * 
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * 
 * @author Rajani N
 *
 */
public class HarmoniousSubsequence {

	private static int findHarmoniousSubsequence(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			boolean flag = false;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == nums[i])
					count++;
				else if (nums[j] + 1 == nums[i]) {
					count++;
					flag = true;
				}
			}
			if (flag)
				res = Math.max(count, res);
		}
		return res;
	}

	public static void main(String[] args) {

		int[] nums = {1,3,2,2,5,2,3,7};
		int result = findHarmoniousSubsequence(nums);
		System.out.println("Number of elements in the harmonious sbusequence is: " + result);

	}

}
