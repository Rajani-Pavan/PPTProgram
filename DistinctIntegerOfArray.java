package in.ineuron.assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Question 4
 * 
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of
 * size 2 where:
 * 
 * - answer[0] is a list of all distinct integers in nums1 which are not present
 * in nums2. - answer[1] is a list of all distinct integers in nums2 which are
 * not present in nums1.
 * 
 * Note: that the integers in the lists may be returned in any order.
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
 * 
 * Output: [[1,3],[4,6]]
 * 
 * Explanation:
 * 
 * For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1
 * and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
 * 
 * For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4
 * and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
 */

public class DistinctIntegerOfArray {

	private static List<Integer> getElementsInFirstList(int[] nums1, int[] nums2) {
		Set<Integer> onlyInNums1 = new HashSet<>();

		Set<Integer> existsInNums2 = new HashSet<>();
		for (int num : nums2) {
			existsInNums2.add(num);
		}

		for (int num : nums1) {
			if (!existsInNums2.contains(num)) {
				onlyInNums1.add(num);
			}
		}

		return new ArrayList<>(onlyInNums1);
	}

	private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		return Arrays.asList(getElementsInFirstList(nums1, nums2), getElementsInFirstList(nums2, nums1));
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };

		List<List<Integer>> result = findDifference(nums1, nums2);

		System.out.println("distinct elements:");
		result.forEach(System.out::println);

	}

}
