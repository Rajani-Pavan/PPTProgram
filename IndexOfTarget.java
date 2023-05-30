package in.ineuron.assignment;

/**
 * Q3.Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity. Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * 
 * Output: 2
 * 
 * @author Rajani N
 *
 */

public class IndexOfTarget {
	private static int indexOfTarget(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int mid = 0;

		/*
		 * traverse an array ==> following binary search approach to find the index,
		 * hence complexity is o(log n)
		 */
		while (start <= end) {
			// find the middle index
			mid = (start + end) / 2;
			// compare target with the mid index element
			if (target == nums[mid]) {
				return mid;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		/* insert target at position */
		return end + 1;
	}

	public static void main(String[] args) {
		int index = 0;
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		index = indexOfTarget(nums, target);
		System.out.println("Insertion position of target element " + target + " is " + index);
	}
}
