import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Guess My Number!, with NumberBot! \n");
		System.out.println("NumberBot is thinking of a number between 1 and 100. Can you guess what it is?");
		int guess = scan.nextInt();
		
		int answer = (int)(100 * Math.random()) + 1;
		System.out.println("Your guess: " + guess);
		System.out.println("NumberBot's number: " + answer);
		
		if (guess == answer) {
			
			System.out.println("You are correct! YOU WIN!");
			
		}
		else {
			
			System.out.println("You were off by " + (Math.abs(answer - guess)));
			
		}
		scan.close();
	}
}
