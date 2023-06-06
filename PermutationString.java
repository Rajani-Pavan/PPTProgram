package in.ineuron.assignment6;

/**
 * Question 1
 * 
 * A permutation perm of n + 1 integers of all the integers in the range [0, n]
 * can be represented as a string s of length n where:
 * 
 * - s[i] == 'I' if perm[i] < perm[i + 1], and - s[i] == 'D' if perm[i] > perm[i + 1].
 * 
 * Given a string s, reconstruct the permutation perm and return it. If there
 * are multiple valid permutations perm, return **any of them**.
 * 
 * Example 1:
 * 
 * Input:s = "IDID" Output:
 * 
 * [0,4,1,3,2]
 * 
 * @author Rajani
 *
 */

public class PermutationString {

	private static int[] findPermutationOfString(String s) {
        int length = s.length();
        int low = 0, high = length;
        int[] result = new int[length + 1];
        for (int i = 0; i < length; ++i) {
            if (s.charAt(i) == 'I')
                result[i] = low++;
            else
                result[i] = high--;
        }

        result[length] = low;
        return result;
    }
	
	public static void main(String[] args) {
		String s = "IDID";
		int [] result = findPermutationOfString(s);
		System.out.println("Valid permutations:");
		for (int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
