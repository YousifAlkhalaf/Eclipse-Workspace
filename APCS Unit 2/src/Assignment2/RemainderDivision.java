package Assignment2;

import java.util.Scanner;

public class RemainderDivision {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("What is your first number? ");
		int num1 = scan.nextInt();
		System.out.print("What is your second number? ");
		int num2 = scan.nextInt();
		int baseQuotient = 0;
		int remainder = 0;
		
		if (num1 < num2) {
			baseQuotient = num2/num1;
			remainder = num2%num1;
			System.out.print(num2 + "/" + num1);
		}
		else {
			baseQuotient = num1/num2;
			remainder = num1%num2;
			System.out.print(num1 + "/" + num2);
		}
		
		System.out.print(" = " + baseQuotient + " r " + remainder);
		
		scan.close();
	}

}
