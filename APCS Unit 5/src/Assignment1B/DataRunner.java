package Assignment1B;

import java.util.Arrays;

public class DataRunner {
	public static void main(String[] args) {
		
		double[] arr = new double[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (Math.random() * 100 + 1);
			arr[i] = Math.round(arr[i] * 1000.0) / 1000.0;
		}
		
		Data x = new Data (arr);
		
		System.out.println(Arrays.toString(x.getArray()));
		System.out.println("Smoothed!");
		x.smooth();
		System.out.println(Arrays.toString((x.getArray())));
	}
}
