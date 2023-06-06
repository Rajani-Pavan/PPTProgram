package in.ineuron.assignment5;

/**
 * Question 5 
 * Given two integer arrays arr1 and arr2, and the integer d, return
 * the distance value between the two arrays.
 * 
 * The distance value is defined as the number of elements arr1[i] such that
 * there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
 *
 * Example 1:
 * 
 * Input:arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
 * 
 * Output: 2
 * 
 * @author Rajani N
 *
 */

public class FindDistanceValue {

	private static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int count = 0;
		int x = 0;
		for (int i = 0; i < arr1.length; i++) {
			x = 0;
			for (int j = 0; j < arr2.length; j++) {
				int diff = Math.abs(arr1[i] - arr2[j]);
				if (diff <= d) {
					j = arr2.length;
				} else {
					x++;
				}
			}
			if (x == arr2.length) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] arr1 = { 4, 5, 8 };
		int[] arr2 = { 10, 9, 1, 8 };

		int d = 2;

		int count = findTheDistanceValue(arr1, arr2, d);

		System.out.println("Distance:" + count);

	}

}
