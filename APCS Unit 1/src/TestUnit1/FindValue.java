// Yousif Alkhalaf

package TestUnit1;

import java.util.Scanner;

public class FindValue {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Number of HALF-DOLLARS? ");
		int halfDollars = scan.nextInt();
		System.out.print("\nNumber of QUARTERS? ");
		int quarters = scan.nextInt();
		System.out.print("\nNumber of DIMES? ");
		int dimes = scan.nextInt();
		System.out.print("\nNumber of NICKELS? ");
		int nickels = scan.nextInt();
		System.out.print("\nNumber of PENNIES? ");
		int pennies = scan.nextInt();

		halfDollars = 50 * halfDollars;
		quarters = 25 * quarters;
		dimes = 10 * dimes;
		nickels = 5 * nickels;

		double total = (halfDollars + quarters + dimes + nickels + pennies) / 100.0;

		System.out.println("\nThe total is $" + total);

		scan.close();
	}
}
