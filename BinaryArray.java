package in.ineuron.assignment6;

import java.util.HashMap;
import java.util.Map;

/**
 * Question 4
 * 
 * Given a binary array nums, return the maximum length of a contiguous subarray
 * with an equal number of 0 and 1.
 * 
 * Example 1:
 * 
 * Input: nums = [0,1]
 * 
 * Output: 2
 * 
 * Explanation: [0, 1] is the longest contiguous subarray with an equal number
 * of 0 and 1.
 * 
 * @author Rajani N
 *
 */

public class BinaryArray {

	private static int findSubArrayCount(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int maxlength = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = count + (nums[i] == 1 ? 1 : -1);
			if (map.containsKey(count)) {
				maxlength = Math.max(maxlength, i - map.get(count));
			} else {
				map.put(count, i);
			}
		}
		return maxlength;
	}

	public static void main(String[] args) {

		int[] nums = { 0, 1 };
		int count = findSubArrayCount(nums);
		System.out.println("maximum length of a contiguous subarray with an equal number of 0 and 1: " + count);

	}

}
