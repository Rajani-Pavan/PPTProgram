package in.ineuron.assignment5;

/**
 * Question 7 Suppose an array of length n sorted in ascending order is rotated
 * between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might
 * become:
 * 
 * - [4,5,6,7,0,1,2] if it was rotated 4 times. - [0,1,2,4,5,6,7] if it was
 * rotated 7 times.
 * 
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results
 * in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * 
 * Given the sorted rotated array nums of unique elements, return the minimum
 * element of this array.
 * 
 * You must write an algorithm that runs in O(log n) time. Example 1:
 *
 * Input: nums = [3,4,5,1,2]
 *
 * Output: 1
 *
 * Explanation:
 * 
 * The original array was [1,2,3,4,5] rotated 3 times.
 * 
 * 
 * @author Rajani N
 *
 */

public class ArrayRotation {
	
	private static int findMin(int[] nums) {
		int n = nums.length;
		int flag = 0;

		for (int i = 0; i < n - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			return nums[0];
		}

		int s = 0;
		int e = n - 1;
		int mid = s + (e - s) / 2;

		while (s < e) {
			if (nums[0] <= nums[mid]) {
				s = mid + 1;
			} else if (nums[0] > nums[mid]) {
				e = mid;
			}
			mid = s + (e - s) / 2;
		}
		return nums[s];
	}

	public static void main(String[] args) {

		int [] nums = {3,4,5,1,2};
		int count = findMin(nums);
		System.out.println("minimum element after rotation:"+count);
	}

}
