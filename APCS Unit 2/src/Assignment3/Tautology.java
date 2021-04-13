package Assignment3;

import java.util.Scanner;

public class Tautology {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		boolean A = true;
		boolean B = true;
		boolean Taut =  !(A || B) || (A || B);
		
		System.out.println("A\tB\tTaut");
		System.out.printf("%b\t%b\t%b\n", A, B, Taut);
		B = false;
		Taut = !(A || B) || (A || B);
		System.out.printf("%b\t%b\t%b\n", A, B, Taut);
		A = false;
		B = true;
		Taut = !(A || B) || (A || B);
		System.out.printf("%b\t%b\t%b\n", A, B, Taut);
		B = false;
		Taut = !(A || B) || (A || B);
		System.out.printf("%b\t%b\t%b", A, B, Taut);
		
		scan.close();
	}
}
