package AP_Tile;

import java.util.ArrayList;

public class TileGame {
	
	private ArrayList<NumberTile> board;
	
	public TileGame() {
		board = new ArrayList<NumberTile>();
	}
	
	public TileGame(ArrayList<NumberTile> tiles) {
		board = tiles;
	}

	private int getIndexForFit(NumberTile tile) {
		
		if (board.size() == 0) {
			return 0;
		}
		if (board.size() == 1) {
			if (tile.getRight() == board.get(0).getLeft()) {
				return 0;
			}
			if (tile.getLeft() == board.get(0).getRight()) {
				return 1;
			}
			return -1;
		}
		for (int i = 0; i <= board.size(); i++) {

			boolean fitsLeft;
			boolean fitsRight;

			if (i == board.size()) {
				fitsLeft = tile.getLeft() == board.get(board.size() - 1).getRight();

				if (fitsLeft) {
					return i;
				}
			} else if (i == 0) {
				
				fitsRight = tile.getRight() == board.get(i).getLeft();
				if (fitsRight) {
					return i;
				}
			} else {

				fitsRight = tile.getRight() == board.get(i).getLeft();
				fitsLeft = tile.getLeft() == board.get(i - 1).getRight();

				if (fitsRight && fitsLeft) {
					return i;
				}
			}
		}
		return -1;
	}

	public boolean insertTile(NumberTile tile) {
		int initial = tile.getUp();
		do {
			int x = getIndexForFit(tile);
			if (x != -1) {
				board.add(x, tile);
				return true;
			} else {
				tile.rotate();
			}
		} while (initial != tile.getUp());
		return false;
	}

	public String toString() {
		String r1 = "", r2 = "", r3 = "";
		for (int i = 0; i < board.size(); i++) {
			r1 += String.format("  %d   ", board.get(i).getUp());
			r2 += String.format("%d   %d ", board.get(i).getLeft(), board.get(i).getRight());
			r3 += String.format("  %d   ", board.get(i).getDown());
		}

		String s = r1 + "\n" + r2 + "\n" + r3;
		return s;
	}

	public ArrayList<NumberTile> getBoard() {
		return board;
	}
}
