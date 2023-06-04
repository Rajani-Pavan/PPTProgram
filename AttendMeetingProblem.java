package in.ineuron.assignment3;

/**
 * Question 8
Given an array of meeting time intervals where intervals[i] = [starti, endi],
determine if a person could attend all meetings.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
 */
import java.util.Arrays;
import java.util.Comparator;

public class AttendMeetingProblem {

	private static boolean canAttendMeeting(int[][] intervals) {
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] i1, int[] i2) {
				return i1[0] - i2[0];
			}
		});
		for (int i = 0; i < intervals.length - 1; i++) {
			if (intervals[i][1] > intervals[i + 1][0])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		int [][] intervals = {{0,30},{5,10},{15,20}};
		System.out.println(canAttendMeeting(intervals));
	}

}
