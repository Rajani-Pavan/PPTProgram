package in.ineuron.assignment2;

/**
 * Question 7 An array is monotonic if it is either monotone increasing or
 * monotone decreasing.
 * 
 * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
 * An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
 * 
 * Given an integer array nums, return true if the given array is monotonic, or
 * false otherwise.
 * 
 * Example 1: Input: nums = [1,2,2,3] Output: true
 * 
 * @author Rajani N
 *
 */
public class MonotonousArray {
	
	private static boolean isMonotonic(int [] nums) {
		int value = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            int c = Integer.compare(nums[i], nums[i+1]);
            if (c != 0) {
                if (c != value && value != 0)
                    return false;
                value = c;
            }
        }

        return true;
	}

	public static void main(String[] args) {

		int [] nums = {1,2,2,3};
		if (isMonotonic(nums))
			System.out.println("Given array is monotonic");
		else 
			System.out.println("Given array is not monotonic");
	}

}
