package Unit4Test;

import java.util.Scanner;

public class Question2 {

	public static int factorial(int n, int k) {

		int factorialN = 1, ans = 1;

		for (int i = 2; i <= n; i++) {
			factorialN = i;
			if (i > k) {
				ans *= factorialN;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("What is the value of n? ");
		int n = in.nextInt();
		System.out.print("What is the value of k? ");
		int k = in.nextInt();

		System.out.println("The quotient of n!/k! is " + factorial(n, k) + ".");
	}
}
