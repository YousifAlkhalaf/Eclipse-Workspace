package Assignment2;

import java.util.Scanner;

public class IsItTriangle {
	public static boolean isItTriangle (int a, int b, int c) {
		System.out.printf("\n%d  %d  %d : ", a, b, c);
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			return true;
			
		} 
		else
		return false;
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter in one side length: ");
		int x =  scan.nextInt();
		System.out.print("Enter in another side length: ");
		int y =  scan.nextInt();
		System.out.print("Enter in the remaining side length: ");
		int z =  scan.nextInt();
		
		if (isItTriangle (x, y, z) == true) {
			System.out.print("Forms a triangle");
		} else {
			System.out.print("Does not form a triangle");
		}
		
		scan.close();
	}
}
