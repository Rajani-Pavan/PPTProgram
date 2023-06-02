package in.ineuron.assignment2;

/**
 * Question 8 You are given an integer array nums and an integer k.
 * 
 * In one operation, you can choose any index i where 0 <= i < nums.length and
 * change nums[i] to nums[i] + x where x is an integer from the range [-k, k].
 * You can apply this operation at most once for each index i.
 * 
 * The score of nums is the difference between the maximum and minimum elements
 * in nums.
 * 
 * Return the minimum score of nums after applying the mentioned operation at
 * most once for each index in it.
 * 
 * Example 1: Input: nums = [1], k = 0 Output: 0
 * 
 * Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
 * 
 * @author Rajani N
 *
 */
public class ScoreOfNums {

	private static int minOfNums(int[] nums, int k) {
		int max, min;
		// assuming first element as minimum and maximum value from the given array
		max = min = nums[0];
		// traverse over array and find maximum and minimum value from the array
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);

		}

		// as range is [-k,k] subtract k from max and add k to min then find the
		// difference
		int result = (max - k) - (min + k);

		// return result if it is greater than 0 otherwise 0
		return (result > 0) ? result : 0;
	}

	public static void main(String[] args) {

		int[] nums = { 1 };
		int k = 0;

		int score = minOfNums(nums, k);
		System.out.println("Minimum score of given array is: " + score);

	}
}