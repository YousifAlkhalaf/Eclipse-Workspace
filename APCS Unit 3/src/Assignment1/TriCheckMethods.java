package Assignment1;

import java.util.Scanner;

public class TriCheckMethods {

	public static void triCheck(int a, int b, int c) {
		System.out.println("");
		if (a == b && b == c) {
			System.out.println("Not isosceles, but equilateral.");
		}
		else if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a)) {
			System.out.println("Yes, the triangle is isosceles.");
		}
		else {
			System.out.println("The triangle is scalene.");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter in the length of the first side: ");
		int x = scan.nextInt();
		System.out.print("Enter in the length of the second side: ");
		int y = scan.nextInt();
		System.out.print("Enter in the length of the third side: ");
		int z = scan.nextInt();

		triCheck(x, y, z);
		
		scan.close();
	}
}
