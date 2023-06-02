package in.ineuron.assignment2;

import java.util.Arrays;

/**
 * Question 2 Alice has n candies, where the ith candy is of type candyType[i].
 * Alice noticed that she started to gain weight, so she visited a doctor.
 * 
 * The doctor advised Alice to only eat n / 2 of the candies she has (n is
 * always even). Alice likes her candies very much, and she wants to eat the
 * maximum number of different types of candies while still following the
 * doctor's advice.
 * 
 * Given the integer array candyType of length n, return the maximum number of
 * different types of candies she can eat if she only eats n / 2 of them.
 * 
 * Example 1: Input: candyType = [1,1,2,2,3,3] Output: 3
 * 
 * Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3
 * types, she can eat one of each type.
 * 
 * @author Rajani N
 *
 */

public class CandyProblem {

	private static int distributeCandies(int[] candyType) {

		// start sorting candyType
		Arrays.sort(candyType);

		// First candy is always unique
		int uniqueCandies = 1;

		// lets start traversing from second candy
		for (int i = 1; i < candyType.length && uniqueCandies < candyType.length / 2; i++) {
			// compare each element with previous element if element is not equal then
			// increment the uniqueCandies by 1
			if (candyType[i] != candyType[i - 1]) {
				uniqueCandies++;
			}
		}

		// return minimum out of uniqueCandy and half of the candyType length
		return Math.min(uniqueCandies, candyType.length / 2);

	}

	public static void main(String[] args) {

		int[] candyType = { 1, 1, 2, 2, 3, 3 };

		int minCandy = distributeCandies(candyType);
		System.out.println("Alice can eat " + minCandy+" candies.");
	}

}
