package AP_Tile;

public class NumberTile {

	private int[] tileNums = new int[4];

	public NumberTile() {
		// Up, right, down, left
		for (int i = 0; i < tileNums.length; i++) {
			tileNums[i] = (int) (Math.random() * 9 + 1);
		}
	}

	public void rotate() {
		int[] temp = new int[tileNums.length];
		for (int i = 0; i < tileNums.length; i++) {
			if (i + 1 >= tileNums.length) {
				temp[0] = tileNums[i];
			} else {
				temp[i + 1] = tileNums[i];
			}
		}
		for (int i = 0; i < tileNums.length; i++) {
		tileNums[i] = temp[i];
		}
	}

	public String toString() {
		String r1 = "", r2 = "", r3 = "";
		r1 += String.format("  %d   ", this.getUp());
		r2 += String.format("%d   %d ", this.getLeft(), this.getRight());
		r3 += String.format("  %d   ", this.getDown());
		String s = r1 + "\n" + r2 + "\n" + r3;
		return s;
	}

	public int getUp() {
		return tileNums[0];
	}

	public int getRight() {
		return tileNums[1];
	}

	public int getDown() {
		return tileNums[2];
	}

	public int getLeft() {
		return tileNums[3];
	}
}
