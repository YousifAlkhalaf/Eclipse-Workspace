package Assignment4;

import java.util.Arrays;

public class SortMethods {
	public static int[] select(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
	
	public static int[] insert(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			int num = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > num) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = num;
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
	public static void main (String[] args) {
		int[] arr = {87, 99, 58, 66, 85, 78, 85, 48, 92, 52};
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Selection Sort");
		SortMethods.select(arr);
		
		System.out.println("\n\n");
		
		System.out.println(Arrays.toString(arr2));
		System.out.println("Insertion Sort");
		SortMethods.select(arr2);
	}
}
