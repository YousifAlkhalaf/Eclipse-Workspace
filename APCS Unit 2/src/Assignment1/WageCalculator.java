package Assignment1;

import java.util.Scanner;

public class WageCalculator {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many hours did you work this week? ");
		double hoursWorked = scan.nextDouble();
		System.out.print("What is your hourly wage? ");
		double hourlyWage = scan.nextDouble();
		
		double weeklyWage;
		
		if (hoursWorked <= 40) {
			
			weeklyWage = hourlyWage * hoursWorked;
			
		}
		else {
			
			double overtimeHours = hoursWorked - 40;
			hoursWorked = 40;
			double overtimeWage = hourlyWage * 1.5;			
			weeklyWage = (hoursWorked * hourlyWage) + (overtimeHours * overtimeWage);
			
		}

		System.out.printf("You earned $%.2f before taxes.", weeklyWage);
		
		scan.close();
	}
}
