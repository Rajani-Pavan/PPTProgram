package in.ineuron.assignment4;

/**
 * Question 7
 * 
 * You are given an m x n matrix M initialized with all 0's and an array of
 * operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented
 * by one for all 0 <= x < ai and 0 <= y < bi.
 * 
 * Count and return the number of maximum integers in the matrix after
 * performing all the operations
 * 
 * Input: m = 3, n = 3, ops = [[2,2],[3,3]] Output:** 4 Explanation: The maximum
 * integer in M is 2, and there are four of it in M. So return 4.
 * 
 * @author Rajani
 *
 */
public class MaxIntegerAfterOps {

	private static int maxCount(int m, int n, int[][] ops) {
		int k = ops.length;
		for (int i = 0; i < k; i++) {
			int z = ops[i][0], x = ops[i][1];
			n = Math.min(n, x);
			m = Math.min(m, z);
		}
		return (m * n);
	}

	public static void main(String[] args) {

		int m=3, n=3;
		int [][] ops = {{2,2},{3,3}};
		int count = maxCount(m, n, ops);
		System.out.println("Maximum Integer count in the matrix: "+count);
	}

}
