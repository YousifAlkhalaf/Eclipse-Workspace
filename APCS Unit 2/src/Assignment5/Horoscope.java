package Assignment5;

import java.util.Scanner;

public class Horoscope {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int rawDays = 0;
		boolean validDay = false;
		int day = 0;
		int month = 0;

		while (month < 1 || month > 12) {
			System.out.print("What month were you born in? Type in a number corresponding to your birth month: ");
			month = scan.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("That month does not exist. Try again.");
			}
		}

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			while (validDay == false) {
				System.out.print("On what day were you born?: ");
				day = scan.nextInt();

				if (day > 31 || day < 1)
					System.out.println("Invalid input. Try again");
				else
					validDay = true;
			}
		case 4, 6, 9, 11:
			while (validDay == false) {
				System.out.print("On what day were you born?: ");
				day = scan.nextInt();

				if (day > 30 || day < 1)
					System.out.println("Invalid input. Try again");
				else
					validDay = true;
			}
		case 2:
			while (validDay == false) {
				System.out.print("On what day were you born?: ");
				day = scan.nextInt();

				if (day > 29 || day < 1)
					System.out.println("Invalid input. Try again");
				else
					validDay = true;
			}
		}

		switch (month) {
		case 1:
			rawDays = day;
			break;
		case 2:
			rawDays = day + 31;
			break;
		case 3:
			rawDays = day + 60;
			break;
		case 4:
			rawDays = day + 90;
			break;
		case 5:
			rawDays = day + 121;
			break;
		case 6:
			rawDays = day + 151;
			break;
		case 7:
			rawDays = day + 182;
			break;
		case 8:
			rawDays = day + 213;
			break;
		case 9:
			rawDays = day + 243;
			break;
		case 10:
			rawDays = day + 274;
			break;
		case 11:
			rawDays = day + 304;
		case 12:
			rawDays = day + 335;
		}
		
		if (rawDays >= 20 && rawDays <= 49) 
			System.out.println("\nYou are an Aquarius, so make sure your head isn't in the clouds during your next test!");
		else if (rawDays >= 50 && rawDays <= 80)
			System.out.println("\nYou are a Pisces, so stay away from horror movies, or have your whole night ruined!");
		else if (rawDays >= 81 && rawDays <= 109)
			System.out.println("\nYou are an Aries, so burn every copy of Twilight you come across.");
		else if (rawDays >= 110 && rawDays <= 141)
			System.out.println("\nYou are a Taurus, so learn to relax and go with the flow sometimes.");
		else if (rawDays >= 142 && rawDays <= 171)
			System.out.println("\nYou are a Gemini, so Choose Your Own Adventure books are not recommended.");
		else if (rawDays >= 172 && rawDays <= 204)
			System.out.println("\nYou are a Cancer, so you'd be very good at Among Us.");
		else if (rawDays >= 205 && rawDays <= 235)
			System.out.println("\nYou are a Leo, so devote your life exclusively to your work.");
		else if (rawDays >= 236 && rawDays <= 265)
			System.out.println("\nYou are a Virgo, so stop being worried about perfection because you will never reach it.");
		else if (rawDays >= 266 && rawDays <= 296)
			System.out.println("\nYou are a Libra, so you gotta stop cutting yourself so many breaks");
		else if (rawDays >= 297 && rawDays <= 325)
			System.out.println("\nYou are a Scorpio, so tell people what the heck is going on sometimes.");
		else if (rawDays >= 326 && rawDays <= 356)
			System.out.println("\nYou are a Sagittarius, so stop acting like you can do everything. You can't.");
		else if (rawDays >= 357 || rawDays <= 19)
			System.out.println("\nYou are a Capricorn, so stop making everyone else feel sad and insecure.");

		scan.close();
	}
}
