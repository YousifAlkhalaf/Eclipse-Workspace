package Assignment3;

import java.util.Scanner;

public class XORAlt {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		boolean A = true;
		boolean B = true;
		boolean XOR = !(A && B) && (A || B) ;
		
		System.out.println("A\tB\tA xor B");
		System.out.printf("%b\t%b\t%b\n", A, B, XOR);
		B = false;
		XOR = !(A && B) && (A || B) ;
		System.out.printf("%b\t%b\t%b\n", A, B, XOR);
		A = false;
		B = true;
		XOR = !(A && B) && (A || B) ;
		System.out.printf("%b\t%b\t%b\n", A, B, XOR);
		B = false;
		XOR = !(A && B) && (A || B) ;
		System.out.printf("%b\t%b\t%b", A, B, XOR);
		
		scan.close();
	}
}
