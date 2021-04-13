package Unit2Test;

//Yousif Alkhalaf

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		int sideLength = 1;
		int columnLength = 1;
		
		
		do {
			System.out.print("What are the side lengths of the square? It must be a positive number below 20. ");
			num = scan.nextInt();
			if (num < 1 || num >= 20)
				System.out.println("Try again.");
		} while (num < 1 || num >= 20);

		for (System.out.println(""); columnLength <= num; columnLength++) {
			for (; sideLength <= num; sideLength++) {
				System.out.print("# ");
			}
			System.out.println("");
			sideLength = 1;
		}
	}
}
