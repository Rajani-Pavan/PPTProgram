package in.ineuron.assignment4;

/**
 * 
 * Question 3 Given a 2D integer array matrix, return the transpose of matrix.
 * 
 * The transpose of a matrix is the matrix flipped over its main diagonal,
 * switching the matrix's row and column indices.
 *
 * Example 1:
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * 
 * @author Rajani
 *
 */
public class TransposeOfMatrix {

	private static int[][] findTransposeOfMatrix(int[][] matrix) {
		int length = matrix.length, col = matrix[0].length;
		int[][] transpose = new int[col][length];
		for (int row = 0; row < length; ++row)
			for (int colm = 0; colm < col; ++colm) {
				transpose[colm][row] = matrix[row][colm];
			}
		return transpose;
	}

	public static void main(String[] args) {

		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		matrix = findTransposeOfMatrix(matrix);
		
		System.out.println("Transpose of a given matrix:");
		for ( int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
