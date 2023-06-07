package in.ineuron.assignment7;

/**
 * Question 8 
 * 
 * You are given an array coordinates, coordinates[i] = [x, y], where
 * [x, y] represents the coordinate of a point. Check if these points make a
 * straight line in the XY plane.
 * 
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * 
 * Output:true
 * 
 * @author Rajani
 *
 */
public class StraightLineCoordinates {
	
	    // Returns the delta Y.
	    static int getYDiff(int[] a, int[] b) {
	        return a[1] - b[1];
	    }
	    
	    // Returns the delta X.
	   static int getXDiff(int[] a, int[] b) {
	        return a[0] - b[0];
	    }
	    
	    private static boolean checkStraightLine(int[][] coordinates) {
	        int deltaY = getYDiff(coordinates[1], coordinates[0]);
	        int deltaX = getXDiff(coordinates[1], coordinates[0]);
	        
	        for (int i = 2; i < coordinates.length; i++) {
	            // Check if the slope between points 0 and i, is the same as between 0 and 1.
	            if (deltaY * getXDiff(coordinates[i], coordinates[0])
	                != deltaX * getYDiff(coordinates[i], coordinates[0])) {
	                return false;
	            }
	        }
	        return true;
	    }
	

	public static void main(String[] args) {

		int [][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		
		if (checkStraightLine(coordinates)) {
			System.out.println("given cordinates points form staraight line.");
		} else {
			System.out.println("given co-ordinates points does not form staraight line.");
		}
		
	}

}
