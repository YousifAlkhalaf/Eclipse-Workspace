package AP_SkyView;

public class SkyView {
	// A rectangular array that holds the data representing a rectangular area of
	// the sky
	private double[][] view;

	// Constructs a SkyView object from a 1-D array of scan data
	public SkyView(int numRows, int numCols, double[] scanned) {
		int count = 0, c = 0;
		double[][] view = new double[numRows][numCols];
		for (int r = 0; r < numRows; r++) {
			for (c = 0; c < numCols; c++) {
				view[r][c] = scanned[count];
				count++;
			}
			if (r + 1 < numRows - 1) {
				r++;
				for (c = numCols - 1; c >= 0; c--) {
					view[r][c] = scanned[count];
					count++;
				}
			}
		}
		this.view = view;
	}

	public double getAverage(int startRow, int endRow, int startCol, int endCol) {
		int count = 0;
		double avg = 0;
		for (int j = startRow; j <= endRow; j++) {
			for (int i = startCol; i <= endCol; i++) {
				avg += view[j][i];
				System.out.println(avg);
				count++;
			}
		}
		avg /= count;
		return avg;
	}

	// prints out the 2D array for view
	public String toString() {

		String a = "";

		for (int r = 0; r < view.length; r++) {
			for (int c = 0; c < view[r].length; c++)
				a = a + view[r][c] + " ";
			a += "\n";
		}

		a += "\n\n\n";

		return a;

	}
}
