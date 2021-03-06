package FootballTickets;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketRunners {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int days;
		String name = "";
		String student;
		ArrayList<Ticket> advList = new ArrayList<Ticket>();
		Ticket t = new Ticket();
		
		while (true)  {
			
			System.out.print("Enter name: ");
			name = in.next();
			if (name.equals("q"))
				break;
			
			System.out.print("Days in advance: ");
			days = in.nextInt();
			
			System.out.println("Student:  y/n");
			student = in.next();
			
			if (student.contains("y") || student.contains("Y"))  {
				t = new StudentTicket(name, days);
			}
			else  {
				t = new Ticket(name, days);
			}
			advList.add(t);
			
			System.out.println(t.toString() + "\n");
			
		}
		System.out.println("Thank you");
		in.close();

	}

}

