package Assignment7;

import java.util.Scanner;

public class TriangleMaker {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int user;
		int outline = 1;
		int count = 1;
		
		do {
			System.out.print("Input a positive integer between 1 and 20: ");
			user = scan.nextInt();
		} while (user < 1 || user > 20);
		
		for (; outline <= user; outline++) {
			for (; count <= outline; count++) {
				System.out.print("*");
			}
			count = 1;
			System.out.println("");
		}


	}

}
