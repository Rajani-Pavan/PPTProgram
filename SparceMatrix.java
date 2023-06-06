package in.ineuron.assignment6;

/**
 * Question 8
 * 
 * Given two sparse matrices mat1 of size m x k and mat2 of size k x n, 
 * return the result of mat1 x mat2. You may assume that multiplication is always possible.
 * Input: mat1 = [[1,0,0],[-1,0,3]], mat2 = [[7,0,0],[0,0,0],[0,0,1]]
 * Output: [[7,0,0],[-7,0,3]]
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparceMatrix {

	private static int[][] matMultiply(int[][] mat1, int[][] mat2) {
		int r1 = mat1.length, c1 = mat1[0].length, c2 = mat2[0].length;
		int[][] res = new int[r1][c2];
		Map<Integer, List<Integer>> mp = new HashMap<>();
		for (int i = 0; i < r1; ++i) {
			for (int j = 0; j < c1; ++j) {
				if (mat1[i][j] != 0) {
					mp.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
				}
			}
		}
		for (int i = 0; i < r1; ++i) {
			for (int j = 0; j < c2; ++j) {
				if (mp.containsKey(i)) {
					for (int k : mp.get(i)) {
						res[i][j] += mat1[i][k] * mat2[k][j];
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[][] mat1 = { { 1, 0, 0 }, { -1, 0, 3 } };
		int[][] mat2 = { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };

		int[][] result = matMultiply(mat1, mat2);

		System.out.println("Resulting matrix after multiplication:");

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
