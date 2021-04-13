package ArrTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File("dataTest5.txt"));
		int[] arr = new int[inFile.nextInt()];
		int[] arr2 = new int[arr.length];

		for (int x = 0; x < arr.length; x++) {
			arr[x] = inFile.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		int limit = arr.length;
		for (int i = 0; i < arr.length - 1; i++) {
			int max = i;
			for (int j = i + 1; j < limit; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			if (max != i) {
				int temp = arr[max];
				arr[max] = arr[i];
				arr[i] = temp;
			}
		}

		int temp = 0;
		for (int r = 0; r < arr.length; r++) {
			temp = arr[r];
			if (r % 2 == 0) {
				arr2[r] = temp;
			} else {
				arr2[arr2.length - r] = temp;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
