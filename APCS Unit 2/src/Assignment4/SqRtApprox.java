package Assignment4;

import java.util.Scanner;

public class SqRtApprox {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double a = scan.nextDouble();
		
		double x0 = a/2;
		double x1 = 0;
		boolean isGoodEnough = false;
		double ref1 = 0, ref2 = 0;
		
		do {
			x1 = (x0 + a/x0)/2;
			ref1 = x0;
			ref2 = x1;
			x0 = x1;
			x1 = 0;
			if (Math.abs(ref1-ref2) < 0.0001) {
				isGoodEnough = true;
			}
		} while (isGoodEnough == false);
		
		System.out.print("Approximate square root: ");
		System.out.println(ref2);
		scan.close();
	}
}
