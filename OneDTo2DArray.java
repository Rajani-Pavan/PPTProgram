package in.ineuron.assignment5;

/**
 * 
 * Question 1
 * 
 * Convert 1D Array Into 2D Array
 * 
 * You are given a 0-indexed 1-dimensional (1D) integer array original, and two
 * integers, m and n. You are tasked with creating a 2-dimensional (2D) array
 * with  m rows and n columns using all the elements from original.
 * 
 * The elements from indices 0 to n - 1 (inclusive) of original should form the
 * first row of the constructed 2D array, the elements from indices n to 2 * n -
 * 1 (inclusive) should form the second row of the constructed 2D array, and
 * so on.
 * 
 * Return an m x n 2D array constructed according to the above procedure, or an
 * empty 2D array if it is impossible*.
 * 
 * Input: original = [1,2,3,4], m = 2, n = 2
 * 
 * Output: [[1,2],[3,4]]
 * 
 * Explanation: The constructed 2D array should contain 2 rows and 2 columns.
 * 
 * The first group of n=2 elements in original, [1,2], becomes the first row in
 * the constructed 2D array.
 * 
 * The second group of n=2 elements in original, [3,4], becomes the second row
 * in the constructed 2D array.
 * 
 * @author Rajani N
 *
 */

public class OneDTo2DArray {

	private static int[][] convertOneDTo2DArray(int[] nums, int m, int n) {

		if (m * n != nums.length) {
			return new int[][] {};
		}

		int[][] twoDArray = new int[m][n];
		int k = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				twoDArray[i][j] = nums[k++];
			}
		}

		return twoDArray;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		int m = 2, n = 2;
		int[][] result = convertOneDTo2DArray(nums, 2, 2);

		System.out.println("After converting from 1D to 2D Array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
