package Assignment1;

import java.util.Scanner;

public class DanPowers {

	public static void findDanPowers(int n) {
		final int base = n;
		int pow = 0;
		while (pow <= 20) {
			if (n == 0) {
				System.out.print("0, ");
			} else if (pow == 0)
				System.out.print("1, ");
			else {
				n = n * base;
				System.out.printf("%d, ", n);
			}
			pow++;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter in the base of this exponent number: ");
		int base = scan.nextInt();

		findDanPowers(base);

		scan.close();
	}
}
