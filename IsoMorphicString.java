package in.ineuron.assignment7;

import java.util.Arrays;

/**
 * Question 1:
 * 
 * Given two strings s and t, *determine if they are isomorphic*. Two strings s
 * and t are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character, but a character may map to itself.
 ** 
 * Example 1:
 ** 
 * Input: s = "egg", t = "add"
 ** 
 * Output: true
 * 
 * @author Rajani N
 *
 */
public class IsoMorphicString {

	private static boolean isIsomorphicStrings(String s, String t) {
		int[] mapStoT = new int[256];
		Arrays.fill(mapStoT, -1);

		int[] mapTtoS = new int[256];
		Arrays.fill(mapTtoS, -1);

		for (int i = 0; i < s.length(); ++i) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			// Case 1: No mapping exists in either of the dictionaries
			if (mapStoT[c1] == -1 && mapTtoS[c2] == -1) {
				mapStoT[c1] = c2;
				mapTtoS[c2] = c1;
			}

			else if (!(mapStoT[c1] == c2 && mapTtoS[c2] == c1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "egg";
		String t = "add";

		if (isIsomorphicStrings(s, t)) {
			System.out.println(s + " is isomorphic to " + t);
		} else {
			System.out.println(s + " is not isomorphic to " + t);
		}
	}

}
