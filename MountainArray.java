package in.ineuron.assignment6;

/**
 * Question 3
 * 
 * Given an array of integers arr, return *true if and only if it is a valid
 * mountain array*.
 * 
 * Recall that arr is a mountain array if and only if:
 * 
 * - arr.length >= 3 There exists some i with 0 < i < arr.length - 1 such that:
 * - arr[0] < arr[1] < ... < arr[i - 1] < arr[i] - arr[i] > arr[i + 1] >... >
 * arr[arr.length - 1]
 * 
 * Example 1: Input:arr = [2,1] Output:false
 * 
 * @author Rajani N
 *
 */

public class MountainArray {

	private static boolean isValidMountainArray(int[] nums) {

		int length = nums.length;
		int i = 0;

		// walking up to mountain
		while (i + 1 < length && nums[i] < nums[i + 1])
			i++;

		// peak cannot be either first element or last element
		if (i == 0 || i == length - 1)
			return false;

		// once if we find the peak element then walk down from the peak
		while (i + 1 < length && nums[i] > nums[i + 1])
			i++;

		return i == length - 1;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 1 };

		if (isValidMountainArray(nums)) {
			System.out.println("Its a valid mountain array");
		} else {
			System.out.println("Its a invalid mountain array");
		}

	}

}
