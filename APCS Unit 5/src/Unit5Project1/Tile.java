package Unit5Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tile {

	private int xPos, yPos, sat;

	public Tile(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.sat = 0;
	}

	public static void sortPoints(int[] rectangle) {
		int temp;
		if (rectangle[0] > rectangle[2]) {
			temp = rectangle[0];
			rectangle[0] = rectangle[2];
			rectangle[2] = temp;
		}
		if (rectangle[1] > rectangle[3]) {
			temp = rectangle[1];
			rectangle[1] = rectangle[3];
			rectangle[3] = temp;
		}
	}

	public void satUp(int[] rectangle) {
		if (this.xPos >= rectangle[0] && this.xPos <= rectangle[2]) {
			if (this.yPos >= rectangle[1] && this.yPos <= rectangle[3]) {
				this.sat++;
			}
		}
	}
	
	public int getSaturation() {
		return this.sat;
	}
	
	public int getXPos() {
		return this.xPos;
	}
	
	public int getYPos() {
		return this.yPos;
	}

}
