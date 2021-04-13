package Assignment7;

import java.util.Scanner;

public class FindPrimes {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		boolean isPrime = true;
		int factorScan = 1;
		int enterCounter = 0;
		
		System.out.println("Prime numbers between 1 and 1000: \n");

		for (; num <= 1000; num++) {
			if (num == 1) {
				isPrime = false;
			} else {
				for (; factorScan <= num; factorScan++) {
					if (num % factorScan == 0) {
						if (factorScan != 1 && factorScan != num) {
							isPrime = false;
						}
					}
				}
				if (isPrime == true) {
					System.out.print(num + ", ");
					enterCounter++;
					if (enterCounter >= 10) {
						System.out.println("\n");
						enterCounter = 0;
					}
				}
				factorScan = 1;
				isPrime = true;
			}
		}
	}
}
