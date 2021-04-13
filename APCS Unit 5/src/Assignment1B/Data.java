package Assignment1B;

import java.util.Arrays;

public class Data {

	private double[] values;
	
	public Data (double[] values) {
		this.values = values;
	}
	
	public double[] getArray() {
		return values;
	}

	public void smooth () {
		double[] og = Arrays.copyOf(values, 10);
		for (int i = 0; i < 10; i++) {
			if (i - 1 < 0) {
				 values[i] = (og[i] + og[i + 1]) / 2;
				 values[i] = Math.round(values[i] * 1000.0) / 1000.0;
			}
			else if (i + 1 >= og.length) {
				values[i] = (og[i] + og[i - 1]) / 2;
				values[i] = Math.round(values[i] * 1000.0) / 1000.0;
			} else {
				values[i] = (og[i] + og[i - 1] + og[i + 1]) / 3;
				values[i] = Math.round(values[i] * 1000.0) / 1000.0;
			}
		}
	}
}
