package AP_Trails;

import java.util.Arrays;

public class Trail {
	private int[] markers;

	// -----------------------------------------------------------------------

	public Trail(int[] arr) {
		markers = new int[arr.length];
		markers = Arrays.copyOf(arr, arr.length);
	}

	// -----------------------------------------------------------------------

	public void printMarkers() {

		for (int i : markers) {
			System.out.println(i);
		}

	}

	// ---------------------------------------------------------------------------

	public boolean isLevelTrailSegment(int start, int end) {
		int max = 0, min = 0;
		for (min = markers[start]; start <= end; start++) {
			if (markers[start] > max) {
				max = markers[start];
			}
			if (markers[start] < min) {
				min = markers[start];
			}
		}
		int difference = Math.abs(max - min);
		if (difference <= 10) {
			return true;
		} else {
			return false;
		}
	}

	// -----------------------------------------------------------------------------

	public boolean isDifficult() {
		int count = 0;
		for (int i = 0; i < markers.length - 1; i++) {
			int change = Math.abs(markers[i] - markers[i + 1]);
			if (change >= 30) {
				count++;
			}
		}
		if (count >= 3) {
			return true;
		} else {
			return false;
		}
	}

}
