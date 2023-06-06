package in.ineuron.assignment6;

/**
 * Question 7
 * 
 * Given a positive integer n, generate an n x n matrix filled with elements
 * from 1 to n^2 in spiral order.
 * 
 * Input: n = 3
 * 
 * Output: [[1,2,3],[8,9,4],[7,6,5]]
 * 
 * @author Rajani N
 *
 */

public class SpiralMatrix {

	private static int MAX = 100;

	private static void fillSpiralOrder(int n) {

		// Initialize value to be filled in matrix
		int val = 1;
		int[][] matrix = new int[MAX][MAX];

		/*
		 * rowIdx - starting row index m - ending row index colIdx - starting column
		 * index n - ending column index
		 */

		int rowIdx = 0, colIdx = 0;
		int m = n;
		int size = n;
		while (rowIdx < m && colIdx < n) {
			/*
			 * Print the first row from the remaining rows
			 */
			for (int i = colIdx; i < n; ++i) {
				matrix[rowIdx][i] = val++;
			}

			rowIdx++;

			/*
			 * Print the last column from the remaining columns
			 */
			for (int i = rowIdx; i < m; ++i) {
				matrix[i][n - 1] = val++;
			}
			n--;

			/*
			 * Print the last row from the remaining rows
			 */
			if (rowIdx < m) {
				for (int i = n - 1; i >= colIdx; --i) {
					matrix[m - 1][i] = val++;
				}
				m--;
			}

			/*
			 * Print the first column from the remaining columns
			 */
			if (colIdx < n) {
				for (int i = m - 1; i >= rowIdx; --i) {
					matrix[i][colIdx] = val++;
				}
				colIdx++;
			}
		}

		System.out.println("spiral order of the matrix of size " + size + "X" + size + " is:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {

		int n = 3;
		fillSpiralOrder(n);
	}

}
