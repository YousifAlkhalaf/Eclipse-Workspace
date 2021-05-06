package Array_Review_2;

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] multiples = new int[12];
		int num;

		System.out.print("Enter a non-zero integer: ");
		num = scan.nextInt();
		
		for (int i = 0; i < 12; i++) {
			multiples[i] = num * (i+1);
		}
		
		for (int i = 0; i < multiples.length; i++) {
			System.out.print(multiples[i] + ", ");
		}
	}
}
