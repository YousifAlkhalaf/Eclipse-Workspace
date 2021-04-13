package Assignment2;

import java.util.Scanner;

public class IsDivisible {
	public static boolean isDivisible(int n, int m) {
		if (n % m == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter in the divisor: ");
		int a = scan.nextInt();
		System.out.print("Enter in the dividend: ");
		int b = scan.nextInt();
		System.out.println("");
		
		if (isDivisible(b, a)) {
			System.out.print("They are divisible");
		} else {
			System.out.print("They are not divisible");
		}
		
		scan.close();
	}
}
