package Assignment7;

import java.util.Scanner;

public class IsItPrime {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int user = 0;
		boolean isPrime = true;
		int factorScan = 1;

		do {
			System.out.print("Input a positive integer: ");
			user = scan.nextInt();
		} while (user < 1);

		if (user == 1) {
			isPrime = false;
			System.out.println("\n1 is not a prime number.\nIts only factor is 1.");
		} else {
			for (System.out.print("\nIts factors are "); factorScan <= user; factorScan++) {
				if (factorScan == user) {
					System.out.print("and " + user);
				} else if (user % factorScan == 0) {
					System.out.print(factorScan + ", ");
					if (factorScan != 1 && factorScan != user) {
						isPrime = false;
					}
				}
			}
			System.out.println("\n");
			if (isPrime == true) {
				System.out.println(user + " is a prime number.");
			} else {
				System.out.println(user + " is not a prime number.");
			}
		}
		scan.close();
	}

}
