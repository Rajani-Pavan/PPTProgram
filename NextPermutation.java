package in.ineuron.assignment3;

public class NextPermutation {

	private static void findNextPermutation(int []nums) {
	 int i = nums.length - 2;
     while (i >= 0 && nums[i + 1] <= nums[i]) {
         i--;
     }
     if (i >= 0) {
         int j = nums.length - 1;
         while (nums[j] <= nums[i]) {
             j--;
         }
         swap(nums, i, j);
     }
     reverse(nums, i + 1);
     System.out.println("Next Permutation is:");
     for(int k=0;k<nums.length;k++) {    	 
    	 System.out.print(nums[k]+" ");
     }
 }

	private static void reverse(int[] nums, int start) {
		int i = start, j = nums.length - 1;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {

		int [] nums = {1,2,3};
		findNextPermutation(nums);
	}

}
