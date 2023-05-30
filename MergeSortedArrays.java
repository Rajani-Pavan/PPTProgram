package in.ineuron.assignment;

/**
 *
 * Q5. You are given two integer arrays nums1 and nums2, sorted in
 * non-decreasing order, and two integers m and n, representing the number of
 * elements in nums1 and nums2 respectively.
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored. nums2 has a length of
 * n. Example 1: Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * 
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6]. The result of
 * the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * 
 * @author Rajani N
 *
 */
public class MergeSortedArrays {

	private static int[] mergeArrays(int[] nums1, int nums2[], int nums1len, int nums2len) {

		int i = nums1len - 1;
		int j = nums2len - 1;
		int k = (nums1len + nums2len) - 1;
		/* traversing two arrays */
		while (i >= 0 && j >= 0) {
			/*
			 * merging nums2 elements into nums1 array based on comparison (3 pointer
			 * approach) i is used to traverse nums1 array and k is at 0th position it gets
			 * updated based on the comparison. j is pointing to nums2 array. Approach :
			 * last elements of both the arrays are compared if among them which is max or
			 * big that element moved to last position of first array.
			 */
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
		// remaining elements in second array moved to first array
		while (k > i) {
			nums1[k] = nums2[j];
			k--;
			j--;
		}
		return nums1;
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int i = 0;
		int nums1len = 0;
		while (nums1[i] != 0) {
			nums1len = ++i;
		}
		int nums2len = nums2.length;
		int[] result = mergeArrays(nums1, nums2, nums1len, nums2len);
		System.out.println("Elements of an array after merging:");
		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j] + "\t");
		}

	}

}
