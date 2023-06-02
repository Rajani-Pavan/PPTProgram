package in.ineuron.assignment2;

/**
 * Question 6: Given an array of integers nums which is sorted in ascending
 * order, and an integer target, write a function to search target in nums. If
 * target exists, then return its index. Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 9 Output: 4
 * 
 * Explanation: 9 exists in nums and its index is 4
 * 
 * @author Rajani N
 *
 */
public class SearchForTarget {

	private static int binarySearch(int[] nums,int first,int last, int target) {
		// follow the binary search approach (recursion) to achieve o(log n) complexity
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (target > nums[mid]) {
				return binarySearch(nums,mid + 1,last,target);
			} else {
				return binarySearch(nums,first,mid-1,target);
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		
		int [] nums = {-1,0,3,5,9,12};
		int target = 9;
		int index = binarySearch(nums,0,nums.length-1, target);
		if (index != -1) {
			
			System.out.println(target +" exists in nums and its index is "+index);
		} else {
			System.out.println(target +" does not exists in nums and its index is "+index);
			
		}

	}

}
