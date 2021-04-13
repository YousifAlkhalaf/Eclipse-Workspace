package Assignment1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pick a number, and see if it's even or odd!\n");
		System.out.print("Enter an integer value: ");
		int input = scan.nextInt();
		
		if ((input % 2) != 0) {
			
			System.out.println("The number " + input + " is odd!");
		}
		else {
			
			System.out.println("The number " + input + " is even!");
		}
		scan.close();
	}
}
