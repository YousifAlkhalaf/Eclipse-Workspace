package Assignment2;

import java.util.Scanner;

public class VaryingSize2DArr {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("How tall should the array be? ");
		int n = scan.nextInt();
		System.out.print("How wide should the array be? ");
		int m = scan.nextInt();

		int[][] arr = new int[n][m];
		int r = 0;
		int c = 1;

		System.out.print("  |");
		for (c = 0; c < arr[r].length; c++) {
			System.out.print(c + " |");
		}
		System.out.print("\n  ");
		for (c = 0; c < arr[r].length; c++) {
			System.out.print("---");
		}
		System.out.println();

		for (r = 0; r < arr.length; r++) {
			for (c = 0; c < arr[r].length; c++) {
				arr[r][c] = (int) (Math.random() * 10);
			}
		}
		for (r = 0; r < arr.length; r++) {
			System.out.print(r + " |");
			for (c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " |");
			}
			System.out.println();
		}

		scan.close();
	}
}
