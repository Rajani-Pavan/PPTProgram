package in.ineuron.assignment;

/**
 * Q7.Given an integer array nums, move all 0's to the end of it while
 * maintaining the relative order of the nonzero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * Example 1: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
 * 
 * @author Rajani N
 *
 */

public class MoveZerosToEnd {

	private static int[] moveZerosAtLast(int[] nums) {
		int temp = 0;
		//Traversal of array and moves zero's to end of the array
		for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++) {
				if (nums[i] == 0 && nums[i] < nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {

		int [] nums = {0,1,0,3,12};
		nums = moveZerosAtLast(nums);
		System.out.println("Elements after moving zeros to last position of the array:");
		for (int k=0;k<nums.length;k++) 
			System.out.print(nums[k]+" ");
	}

}
