package Assignment1;

import java.util.Scanner;

public class Roshambo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int opponentChoice = (int) (3 * Math.random()) + 1;
		String playerPick = "dummy";
		String opponentPick = "dummy";
		
		//boolean inputValid;
		
		System.out.print("Choose rock(1), paper(2), or scissors(3): ");
		int playerChoice = scan.nextInt();
		
		boolean inputValid = false;
		
		do {

			if ((playerChoice >= 1) && (playerChoice <= 3)) {
				inputValid = true;
			}
			else {
				System.out.println("Invalid input. Please try again.");
				System.out.print("Choose rock(1), paper(2), or scissors(3): ");
				playerChoice = scan.nextInt();
				inputValid = false;
			}
		}while (inputValid = false); 
		
		if (playerChoice == 1) {
			playerPick = "rock";
		}
		else if (playerChoice == 2) {
			playerPick = "paper";
		}
		else if (playerChoice == 3) {
			playerPick = "scissors";
		}
		if (opponentChoice == 1) {
			opponentPick = "rock";
		}
		else if (opponentChoice == 2) {
			opponentPick = "paper";
		}
		else if (opponentChoice == 3) {
			opponentPick = "scissors";
		}
		
		if (playerChoice == opponentChoice) {
			
			System.out.print("I choose " + opponentPick + ". You choose " + playerPick + ". It is a draw.");
			
		}
		
		else if (((playerChoice == 2) && (opponentChoice == 1)) || ((playerChoice == 3) && (opponentChoice == 2)) || ((playerChoice == 1) && (opponentChoice == 3))) {
			
			System.out.println("I choose " + opponentPick + ". You choose " + playerPick + ". You win.");
			
		}
		
		else if (((playerChoice == 1) && (opponentChoice == 2)) || ((playerChoice == 2) && (opponentChoice == 3)) || ((playerChoice == 3) && (opponentChoice == 1))) {
			
			System.out.println("I choose " + opponentPick + ". You choose " + playerPick + ". I win.");
			
		}
		
		scan.close();
		
	}
}
