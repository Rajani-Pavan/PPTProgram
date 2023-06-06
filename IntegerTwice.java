package in.ineuron.assignment5;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Question 6
 * 
 * Given an integer array nums of length n where all the integers of nums are in
 * the range [1, n] and each integer appears once or twice, return an array of
 * all the integers that appears twice.
 * 
 * You must write an algorithm that runs in O(n) time and uses only constant
 * extra space.
 * 
 * Example 1:
 * 
 * Input: nums = [4,3,2,7,8,2,3,1]
 * 
 * Output: [2,3]
 * 
 * @author Rajani N
 *
 */
public class IntegerTwice {

	private static void findIntegerAppearsTwice(int[] nums) {

		int[] result = new int[10];
		int j = 0;
		// store all the elements as key and its occurrence as value in the map
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		// iterate the map and find the value of the key which is 1 then return that
		// value
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				result[j] = entry.getKey();
				j++;
			}
		}
		System.out.println("Integers that appears twice in a given array:");
		for (int i = 0; i < result.length; i++) {
			if (result[i] != 0) {
				System.out.print(result[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findIntegerAppearsTwice(nums);
	}
}
