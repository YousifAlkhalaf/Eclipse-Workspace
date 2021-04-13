package Assignment4;

import java.util.Scanner;

public class ProgramCollection {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int evenSum = 2;
		int count = 2;
		int sqRtCheck = 1;
		int sqRtSum = 0;
		int sqRtNum = 1;
		int twoPow = 0;
		int pow2 = 1;
		int total4 = 0;
		

		do {
			evenSum = evenSum + (2 * count);
			count++;
		} while (count * 2 <= 100);
		System.out.println("The sum of all even numbers 2 through 100 is " + evenSum);

		while ((sqRtCheck * sqRtCheck) <= 100) {
			if (sqRtNum / sqRtCheck == sqRtCheck) {
				sqRtSum = sqRtSum + sqRtNum;
				sqRtCheck++;
				sqRtNum++;
			} else {
				sqRtNum++;
			}
		}
		System.out.println("The sum of all squares between 1 and 100 is " + sqRtSum);

		System.out.print("All powers of 2 from 2^0 to 2^20: ");
		for (; twoPow <= 20; twoPow++) {
			System.out.print(pow2 + ", ");
			pow2 = pow2 * 2;
		}

		System.out.print("\n\nInput a: ");
		int a = scan.nextInt();
		System.out.print("Input b: ");
		int b = scan.nextInt();

		for (int aPlus = a; aPlus <= b; aPlus++) {
			total4 = total4 + aPlus;
		}
		System.out.println("The sum of all numbers from a to b is " + total4);
		
		System.out.print("\nEnter another input: ");
		int x = scan.nextInt();
		int sum = 0;
		 while (x > 0) {
	            int lastDigit = x % 10;
	            x = x/10;
	            if (lastDigit%2 != 0) {
	            	sum = sum + lastDigit;
	            }
	        }
		System.out.println("Sum of all odd digits: " + sum);
		
		scan.close();
	}
}
