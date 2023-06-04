package in.ineuron.assignment3;

import java.util.HashMap;
import java.util.Map;

/**
 * Question 6: Given a non-empty array of integers nums, every element appears
 * twice except for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * Example 1: Input: nums = [2,2,1] Output: 1
 * 
 * @author Rajani N
 *
 */
public class UniqueElementInArray {

	public static void main(String[] args) {

		int[] nums = { 2,2,1 };
		int uniqueElement = findUniqueElement(nums);
		System.out.println("Unique element from the array is: " + uniqueElement);
	}

	private static int findUniqueElement(int[] nums) {
		//store all the elements as key and its occurrence as value in the map
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		//iterate the map and find the value of the key which is 1 then return that value
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return 0;
	}

}
