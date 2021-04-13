package Unit5Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HiddenPictures {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner inFile = new Scanner(new File("HiddenPictures.txt"));
		int canvasX = inFile.nextInt(), canvasY = inFile.nextInt();

		Tile grid[][] = new Tile[canvasX][canvasY];

		for (int y = 0; y < canvasY; y++) {
			for (int x = 0; x < canvasX; x++) {
				grid[x][y] = new Tile(x, canvasY - y - 1);
			}
		}

		while (inFile.hasNext()) {
			int[] rectangle = { inFile.nextInt(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt() };
			Tile.sortPoints(rectangle);
			for (int y = 0; y < canvasY; y++) {
				for (int x = 0; x < canvasX; x++) {
					grid[x][y].satUp(rectangle);
				}
			}
		}
		
		for (int y = 0; y < canvasY; y++) {
			for (int x = 0; x < canvasX; x++) {
				if (grid[x][y].getSaturation() % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
