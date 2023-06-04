package in.ineuron.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, return an array of all the unique
 * quadruplets [nums[a], nums[b], nums[c], nums[d]] such that: 1. 0 <= a, b, c,
 * d < n 2. a, b, c, and d are distinct. 3. nums[a] + nums[b] + nums[c] +
 * nums[d] == target
 * 
 * You may return the answer in any order.
 * 
 * Example 1: Input: nums = [1,0,-1,0,-2,2], target = 0 Output:
 * [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * 
 * @author Rajani N
 *
 */

public class SumOfQuadraplats {

	private static List<List<Integer>> findQuadruplets(int[] nums, int target) {

		// sort the given array
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		// check if the array is empty or less than 4 elements
		if (nums.length == 0 || nums.length < 3) {
			return ans;
		}
		// following two pointer approach
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int low = j + 1;
				int high = (nums.length) - 1;
				int sum = target - nums[i] - nums[j];
				while (low < high) {
					if (nums[low] + nums[high] == sum) {
						List<Integer> temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[low]);
						temp.add(nums[high]);
						ans.add(temp);
						// check for duplicate elements and ignore if duplicate exists
						while (low < high && nums[low] == nums[low + 1]) {
							low++;
						}
						while (low < high && nums[high] == nums[high - 1]) {
							high--;
						}
						low++;
						high--;
					} else if (nums[low] + nums[high] < sum) {
						low++;
					} else {
						high--;
					}
				}
				while (j + 1 < nums.length && nums[j + 1] == nums[j]) {
					j++;
				}
			}
			while (i + 1 < nums.length && nums[i + 1] == nums[i]) {
				i++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;

		List<List<Integer>> list = findQuadruplets(nums, target);
		// lambda expression to print the quadruplets in the list
		list.forEach(System.out::println);

	}

}
