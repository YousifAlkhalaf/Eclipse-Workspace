package Assignment1;

import java.util.Scanner;

public class RootCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

		System.out.print("What is the value of a? ");
		double a = scan.nextDouble();
		System.out.print("What is the value of b? ");
		double b = scan.nextDouble();
		System.out.print("What is the value of c? ");
		double c = scan.nextDouble();
		
		double answer1 = ((b*-1) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2*a);
		double answer2 = ((b*-1) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2*a);
		
		if (Double.isNaN(answer1) && Double.isNaN(answer2)) {
			
			System.out.println("The equation has no real roots");
			
		}
		
		else if ((!Double.isNaN(answer1)) && ((Double.isNaN(answer2)))) {
			
			System.out.println("The equation has 1 root: " + answer1);
			
		}
		else if ((Double.isNaN(answer1)) && ((!Double.isNaN(answer2)))) {
			
			System.out.println("The equation has 1 root: " + answer2);
			
		}
		else if (answer1 == answer2) {
			
			System.out.println("The equation has 1 root: " + answer1);
			
		}
		else {
			
			System.out.printf("The equation has 2 roots: %.6f and %.6f", answer1, answer2);
			
		}
		
		scan.close();
	}

}
