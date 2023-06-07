package in.ineuron.assignment7;

/**
 * Question 5
 * 
 * Given a string s, reverse the order of characters in each word within a
 * sentence while still preserving whitespace and initial word order.
 * 
 * Example 1:
 * 
 * Input: s = "Let's take LeetCode contest"
 * 
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * 
 * @author Rajani
 *
 */
public class ReverseSentence {

	private static String reverseString(String s) {

		int lastSpaceIndex = -1;
		char[] chArray = s.toCharArray();
		int len = s.length();
		for (int strIndex = 0; strIndex <= len; strIndex++) {
			if (strIndex == len || chArray[strIndex] == ' ') {
				
				int startIndex = lastSpaceIndex + 1;
				int endIndex = strIndex - 1;
				
				while (startIndex < endIndex) {
					
					char temp = chArray[startIndex];
					chArray[startIndex] = chArray[endIndex];
					chArray[endIndex] = temp;
					startIndex++;
					endIndex--;
				}
				lastSpaceIndex = strIndex;
			}
		}
		return new String(chArray);
	}

	public static void main(String[] args) {

		String s = "Let's take LeetCode contest";
		System.out.println("Original String is :" + s);
		s = reverseString(s);
		System.out.println("Reversed string is :" + s);
	}

}
