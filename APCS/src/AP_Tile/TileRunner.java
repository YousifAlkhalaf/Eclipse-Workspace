package AP_Tile;

import java.util.ArrayList;

public class TileRunner {
	public static void main(String[] args) {
		ArrayList<NumberTile> tiles = new ArrayList<NumberTile>();
		TileGame game = new TileGame();
		int timesFailed = 0;

		for (int i = 0; i < 9; i++) {
			tiles.add(new NumberTile());
		}
		
		do {
			int tilesAdded = 0;
			for (int i = 0; i < tiles.size(); i++) {
				NumberTile t = tiles.get(i);
				if (game.insertTile(t)) {
					tiles.remove(i);
					tilesAdded++;
//					System.out.println(game);
				} else {
//					System.out.println("Fail");
//					System.out.println(t);
				}
			}
			if (tilesAdded == 0) {
				timesFailed++;
			}
		} while (timesFailed < 2);
		
		System.out.println(game);
		System.out.println("Tiles that could not be placed");
		System.out.println(new TileGame(tiles));
	}
}
