package in.ineuron.assignment7;

/**
 * Question 6
 * 
 * Given two strings s and goal, return true if and only if s can become goal
 * after some number of shifts on s.
 * 
 * A shift on s consists of moving the leftmost character of s to the rightmost
 * position.
 * 
 * - For example, if s = "abcde", then it will be "bcdea" after one shift.
 *
 * Example 1: Input: s = "abcde", goal = "cdeab" Output: true
 * 
 * @author Rajani
 *
 */
public class ShiftingString {

	private static boolean isStringGoal(String str, String goal) {
		if (str.length() != goal.length())
			return false;
		if (str.length() == 0)
			return true;

		search: for (int s = 0; s < str.length(); ++s) {
			for (int i = 0; i < str.length(); ++i) {
				if (str.charAt((s + i) % str.length()) != goal.charAt(i))
					continue search;
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String str = "abcde";
		String goal = "cdeab";

		if (isStringGoal(str, goal)) {
			System.out.println(str + " becomes goal: " + goal);
		} else {
			System.out.println(str + " cannot become a goal: " + goal);
		}

	}
}
