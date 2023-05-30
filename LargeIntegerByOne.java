package in.ineuron.assignment;

/**
 * Q4. You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer. The digits are ordered
 * from most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Example 1: Input: digits = [1,2,3] Output: [1,2,4]
 * 
 * Explanation:The array represents the integer 123.
 * 
 * Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1,2,4].
 * 
 * @author Rajani N
 *
 */
public class LargeIntegerByOne {

	private static int largeIntByOne(int nums[]) {
		int sum = 0;
		int lsb = 1;
		int index = nums.length - 1;
		
		// traverse an array and calculate the sum
		while (index >= 0) {
			sum += lsb * nums[index];
			index--;
			lsb *= 10;
		}
		System.out.println("Large integer is: "+sum);
		//increase sum by 1 and return
		return sum + 1;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		int sum = largeIntByOne(nums);
		System.out.println("Large integer increased by 1:" + sum);
	}
}
