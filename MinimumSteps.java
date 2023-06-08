package in.ineuron.assignment8;

/**
 * Question 3
 * 
 * Given two strings word1 and word2, return the minimum number of steps
 * required to make* word1 and word2 the same.
 * 
 * In one step, you can delete exactly one character in either string.
 ** 
 * Example 1:
 ** 
 * Input:word1 = "sea", word2 = "eat"
 * 
 * Output: 2
 ** 
 * Explanation:** You need one step to make "sea" to "ea" and another step to
 * make "eat" to "ea".
 * 
 * @author Rajani N
 *
 */

public class MinimumSteps {

	private static int findMinimumSteps(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();

		int[] dp = new int[n + 1];
		// as java already contain 0 as default value no need to initailize the dp array
		for (int i = 1; i < m + 1; i++) {
			int[] temp = new int[n + 1];
			for (int j = 1; j < n + 1; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1))
					temp[j] = 1 + dp[j - 1];

				else
					temp[j] = Math.max(dp[j], temp[j - 1]);
			}
			dp = temp;
		}
		return m + n - (2 * dp[n]);
	}

	public static void main(String[] args) {

		String word1 = "sea";
		String word2 = "eat";

		int minSteps = findMinimumSteps(word1, word2);
		System.out.println("Minimum steps required:" + minSteps);
	}

}
