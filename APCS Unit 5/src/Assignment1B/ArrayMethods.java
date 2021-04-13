package Assignment1B;

import java.util.Arrays;

public class ArrayMethods {

	public static void swapFirstAndLast(int[] values) {
		int temp = values[0];
		int x = values.length - 1;
		int temp2 = values[x];
		values[0] = temp2;
		values[x] = temp;
	}

	public static void printArray(int[] values) {
		for (int i = 0; i < 10; i++) {
			System.out.print(values[i]);
			System.out.print(", ");
		}
	}

	public static void reset(int[] arr1, int[] arr2) {
		for (int i = 0; i < 10; i++) {
			arr1[i] = arr2[i];
		}
	}

	// Messed around and made this by accident, decided to keep

	public static void shiftLeft(int[] values) {
		int temp = values[0];
		for (int i = 0; i < 9; i++) {
			values[i] = values[i + 1];
		}
		values[9] = temp;
	}

	public static void shiftRight(int[] values) {
		int temp = values[9];
		for (int i = 9; i > 0; i--) {
			values[i] = values[i - 1];
		}
		values[0] = temp;
	}

	public static void evenToZero(int[] values) {
		int i = 0;
		for (int element : values) {
			if (element % 2 == 0) {
				values[i] = 0;
			}
			i++;
		}
	}

	public static void neighborReplace(int[] values) {
		int[] startValues = Arrays.copyOf(values, 10);
		for (int i = 1; i < 9; i++) {
			if (startValues[i - 1] > startValues[i + 1]) {
				values[i] = startValues[i - 1];
			} else {
				values[i] = startValues[i + 1];
			}
		}
	}

	public static int findSecondLargest(int[] values) {
		int largest = 0, secondLargest = 0, i = 0;
		for (int element : values) {
			if (element > secondLargest) {
				if (element > largest) {
					secondLargest = element;
					largest = element;
				} else {
					secondLargest = element;
				}
			}
			i++;
		}
		return secondLargest;
	}

	public static boolean isIncreasing(int[] values) {
		for (int i = 0; i < 9; i++) {
			if (values[i] > values[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean duplicatesAdjacent(int[] values) {
		boolean b = false;
		for (int i = 0; i < 9; i++) {
			if (values[i] == values [i + 1]) {
				b = true;
			}
		}
		return b;
	}
	
	public static boolean duplicates(int[] values) {
		boolean b = false;
		int[] compare = Arrays.copyOf(values, 10);
		for (int i1 = 0; i1 < 10; i1++) {
			for (int i2 = 0; i2 < 10; i2++) {
				if (values[i1] == compare [i2] && i1 != i2) {
					b = true;
				}
			}
		}
		return b;
	}
}
