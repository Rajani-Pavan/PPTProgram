package in.ineuron.assignment2;

/**
 * Question 4: You have a long flowerbed in which some of the plots are planted,
 * and some are not. However, flowers cannot be planted in adjacent plots. Given
 * an integer array flowerbed containing 0's and 1's, where 0 means empty and 1
 * means not empty, and an integer n, return true if n new flowers can be
 * planted in the flowerbed without violating the no-adjacent-flowers rule and
 * false otherwise.
 * 
 * Example 1: Input: flowerbed = [1,0,0,0,1], n = 1 Output: true
 * 
 * @author Rajani N
 *
 */
public class PlantingFlower {

	private static boolean isSlotAvailable(int [] flowerBed) {
		boolean isAvailable = false;
		int sum = 0;
		// Calculate the sum of adjacent elements and compare is it equal to 0 or not
		// if it is equal to 0 then i+1 location update to 1 and isAvailable to true
		for (int i=0;i<flowerBed.length-1;i++) {
			sum = flowerBed[i] + flowerBed[i+1];
			if (sum == 0) {
				isAvailable = true;
				flowerBed[i+1] = 1;
			}
			
		}
		return isAvailable;
	}

	public static void main(String[] args) {

		int[] flowerBed = { 1, 0, 0, 0, 1 };
		if (isSlotAvailable(flowerBed)) {
			System.out.println("Slot is available to plot a plant");
		} else {
			System.out.println("Slot is not available to plot a plant");
		}

	}

}
