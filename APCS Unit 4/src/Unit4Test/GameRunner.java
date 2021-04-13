package Unit4Test;

import java.util.Scanner;

public class GameRunner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Player p1 = new Player("blue");
		Player p2 = new Player("red");

		System.out.println(p1);
		System.out.println(p2);

		boolean checkWinner = false;
		int num;

		while (!checkWinner) {

			// move player 1
			System.out.printf("Input the roll for %s:  ", p1.getColor());
			num = in.nextInt();
			p1.move(num);

			// move player 2
			System.out.printf("Input the roll for %s:  ", p2.getColor());
			num = in.nextInt();
			p2.move(num);

			// report current positions on the board
			System.out.println(p1);
			System.out.println(p2);
			System.out.println();

			// determine if someone has reached square 15 or higher
			checkWinner = (p1.checkWinner() || p2.checkWinner());
		}

		// Report winner
		if (p1.getPosition() > p2.getPosition()) {
			System.out.printf("%s wins!", p1.getColor());
		} else if (p2.getPosition() > p1.getPosition()) {
			System.out.printf("%s wins!", p2.getColor());
		} else
			System.out.println("It's a tie!");
	}

}
