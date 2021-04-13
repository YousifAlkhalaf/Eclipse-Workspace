package Assignment2;

import java.util.Scanner;

public class LeapYearFinder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		boolean isLeapYear;
		boolean tryAgain = false;
		boolean validSelection;
		int year;
		
		do {
		
			System.out.print("Enter a year: ");
			year = scan.nextInt();
			
			if (year >= 1582) {
				if (year%4 == 0) {			
					isLeapYear = true;
							
					if (year%100 == 0) {
						isLeapYear = false;
						
						if (year%400 == 0) {
							isLeapYear = true;
						}
					}
				}
				else {
					isLeapYear = false;
				}	
				
				
				if (isLeapYear == true) {
					System.out.println(year + " was a leap year.");
				}
				else {
					System.out.println(year + " was not a leap year.");
				}
			}
			else {
				System.out.println("That year is not on the Gregorian calandar, and is therefore invalid.");
			}
			do {
				System.out.print("Would you like to try again? Yes (1) No (2) ");
				int againSelection = scan.nextInt();
				
				if (againSelection == 1) {
					tryAgain = true;
					validSelection = true;
				}
				else if (againSelection == 2) {
					tryAgain = false;
					validSelection = true;
				}
				else {
					System.out.println("Invalid choice. Please try again");
					validSelection = false;
				}
			} while (validSelection == false);
			
		} while (tryAgain == true);
		
		scan.close();
		

	}

}
