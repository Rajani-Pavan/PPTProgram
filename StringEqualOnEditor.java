package in.ineuron.assignment7;

import java.util.Stack;

/**
 * Question 7
 * 
 * Given two strings s and t, return true *if they are equal when both are typed
 * into empty text editors*. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * Example 1: Input: s = "ab#c", t = "ad#c"
 * 
 * Output: true
 * 
 * Explanation:
 * 
 * Both s and t become "ac".
 * 
 * 
 * @author Rajani
 *
 */

public class StringEqualOnEditor {

	private static boolean isStringsEqual(String s, String t) {
		return build(s).equals(build(t));
	}

	public static String build(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c != '#')
				stack.push(c);
			else if (!stack.empty())
				stack.pop();
		}
		return String.valueOf(stack);
	}

	public static void main(String[] args) {

		// # is a backspace character

		String s = "ab#c";
		String t = "ad#c";

		if (isStringsEqual(s, t)) {
			System.out.println("Both are same after removing backspace");
		} else {
			System.out.println("Both are not same");
		}

	}

}
