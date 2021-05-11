package AP_Tile;

import java.util.ArrayList;

public class TileRunner {
	public static void main(String[] args) {
		ArrayList<NumberTile> tiles = new ArrayList<NumberTile>();
		TileGame game = new TileGame();

		for (int i = 0; i < 9; i++) {
			tiles.add(new NumberTile());
		}

		int numOfTiles = tiles.size();
		ArrayList<Integer> indexesToRemove = new ArrayList<Integer>();

		for (int i = 0; i < numOfTiles; i++) {
			NumberTile t = tiles.get(i);
			if (game.insertTile(t)) {
				indexesToRemove.add(i);
//				System.out.println(game);
			} else {
//				System.out.println("Fail");
//				System.out.println(t);
			}
		}

		ArrayList<NumberTile> temp = new ArrayList<NumberTile>();
		for (int i = 0; i < tiles.size(); i++) {
			boolean delete = false;
			for (int n : indexesToRemove) {
				if (n == i) {
					delete = true;
					break;
				}
			}
			if (delete == false) {
				temp.add(tiles.get(i));
			}
		}

		tiles = new ArrayList<NumberTile>(temp);

		System.out.println(game);
		System.out.println("Tiles that could not be placed");
		for (NumberTile t : tiles) {
			System.out.println(t);
		}
	}
}
