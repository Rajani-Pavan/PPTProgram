package in.ineuron.assignment6;

/**
 * Question 2
 * 
 * You are given an m x n integer matrix matrix with the following two
 * properties:
 * 
 * - Each row is sorted in non-decreasing order. - The first integer of each row
 * is greater than the last integer of the previous row.
 * 
 * Given an integer target, return true *if* target *is in* matrix *or* false
 * *otherwise*.
 * 
 * You must write a solution in O(log(m * n)) time complexity.
 * 
 * Example 1: Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target =
 * 3 Output: true
 * 
 */

public class SearchElementInMatrix {
	//using binary search approach we can achieve Time complexity : O(log(m*n))

	private static boolean findElementInMatrix(int[][] matrix, int target) {

		int rows = matrix.length;
		int columns = matrix[0].length;
		int low = 0;
		int high = rows * columns;

		if (matrix.length == 0)
			return false;

		while (low < high) {
			int mid = (low + high) / 2;

			if (matrix[mid / columns][mid % columns] == target) {
				return true;
			} else if (matrix[mid / columns][mid % columns] < target) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[][] nums = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;

		boolean isFound = findElementInMatrix(nums, target);
		if (isFound)
			System.out.println("Element " + target + "found");
		else
			System.out.println("Element " + target + " not found");

	}

}
