package in.ineuron.assignment7;

/**
 * Question 5
 * 
 * Given a string s and an integer k, reverse the first k characters for every
 * 2k characters counting from the start of the string.
 * 
 * If there are fewer than k characters left, reverse all of them. If there are
 * less than 2k but greater than or equal to k characters, then reverse the
 * first k characters and leave the other as original.
 *
 * Example 1: Input: s = "abcdefg", k = 2 Output: "bacdfeg"
 * 
 * @author Rajani
 *
 */

public class Reverse2KCharacter {

	private static String reverse2kCharInString(String s, int k) {
		char[] a = s.toCharArray();
		for (int start = 0; start < a.length; start += 2 * k) {
			int i = start, j = Math.min(start + k - 1, a.length - 1);
			while (i < j) {
				char tmp = a[i];
				a[i++] = a[j];
				a[j--] = tmp;
			}
		}
		return new String(a);
	}

	public static void main(String[] args) {

		String s = "abcdefg";
		System.out.println("Original String: " + s);
		int k = 2;
		s = reverse2kCharInString(s, k);
		System.out.println("Reversed string at 2K position: " + s);

	}

}
