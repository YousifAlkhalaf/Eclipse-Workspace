package ArrTest;

// Yousif Alkhalaf
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File("dataTest5_2.txt"));

		// Assigns values to array
		int r, c;
		int[][] arr = new int[6][7];
		for (r = 0; r < arr.length; r++) {
			for (c = 0; c < arr[r].length; c++) {
				arr[r][c] = inFile.nextInt();
			}
		}
		
		for (r = 0; r < arr.length; r++) {
			for (c = 0; c < arr[r].length; c++) {
				System.out.printf("%d ", arr[r][c]);
			}
			System.out.println();
		}
		
		int count = 0;
		boolean hasWon = false;
		for (r = 0; r < arr.length; r++) {
			for (c = 0; c < arr[r].length; c++) {
				if (arr[r][c] == 1) {
					count++;
				} else {
					count = 0;
				}
				if (count >= 4) {
					System.out.printf("Red wins in row %d", r);
					hasWon = true;
				}
			}
		}
		if (!hasWon) {
			System.out.println("Red doesn't win");
		}
	}
}
