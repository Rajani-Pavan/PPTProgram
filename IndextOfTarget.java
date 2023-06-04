package in.ineuron.assignment3;

/**
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1: Input: nums = [1,3,5,6], target = 5 Output: 2
 * 
 * @author Rajani
 *
 */

public class IndextOfTarget {

	//using binary search approach
	private static int findIndexOfTarget(int[] nums, int target) {
		int mid = 0;
		int first = 0;
		int last = nums.length - 1;

		while (first <= last) {
			mid = (first + last) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (target > nums[mid]) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 5 };
		int target = 6;
		int index = findIndexOfTarget(nums, target);
		if (index != -1) {

			System.out.println(target + " found at position:" + index);
		} else {
			System.out.println(target + " not found");
		}
	}

}
