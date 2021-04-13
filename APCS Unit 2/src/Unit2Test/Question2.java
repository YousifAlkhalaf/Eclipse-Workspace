package Unit2Test;

//Yousif Alkhalaf

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		System.out.print("What is the starting value? ");
		int num1 = scan.nextInt();
		System.out.print("What is the second value? ");
		int num2 = scan.nextInt();
		System.out.print("What is the term position? ");
		int elements = scan.nextInt();
		
		int elementCount = 3;
		int nextNum = 0;
		
		for (System.out.print("\n" + num1 + ", " + num2 + ", "); elementCount <= elements; elementCount++) {
			nextNum = (num1 - num2);
			System.out.print(nextNum + ", ");
			num1 = num2;
			num2 = nextNum;
		}
		System.out.print("...,");
		scan.close();
	}
}