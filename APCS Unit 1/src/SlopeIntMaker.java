import java.util.Scanner;

public class SlopeIntMaker {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("What is the value of x1? ");
		double x1 = scan.nextDouble();
		System.out.print("\nWhat is the value of y1? ");
		double y1 = scan.nextDouble();
		System.out.print("\nWhat is the value of x2? ");
		double x2 = scan.nextDouble();
		System.out.print("\nWhat is the value of y2? ");
		double y2 = scan.nextDouble();

		double m = (y2 - y1) / (x2 - x1);

		double b = y1 - (m * x1);

		if (m == 1) {
			System.out.print("y = x");
		}
		else if (m == 0) {
			System.out.print("y = ");
		}
		else {
			System.out.print("y = " + m + "x");
		}
		
		if (b > 0) {
			System.out.print(" + " + b);
		}
		if (b < 0) {
			b = Math.abs(b);
			System.out.print(" - " + b);
		}
		scan.close();
	}
}
