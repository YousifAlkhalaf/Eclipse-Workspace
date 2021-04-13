package Assignment7;

import java.util.Scanner;

public class PerfectNumbers {
	public static void main(String[] args) {
		
		int num = 1;
		int perfectScan = 1;
		int perfectCheck = 0;
		
		System.out.println("Perfect numbers between 1 and 10000: \n");

		for (; num < 10000; num++) {
			if (num != 1) {
				for (; perfectScan < num; perfectScan++) {
					if (num % perfectScan == 0) {
						perfectCheck = perfectCheck + perfectScan;
					}
				}
				if (perfectCheck == num)
					System.out.print(num + ", ");
			}
			perfectScan = 1;
			perfectCheck = 0;
		}
		
	}
}
