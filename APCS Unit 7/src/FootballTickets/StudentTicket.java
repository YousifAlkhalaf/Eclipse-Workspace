package FootballTickets;

public class StudentTicket extends Ticket {
	public StudentTicket(String name, int days) {
		super(name, days);
		super.studentDiscount();
	}
	
	public String toString() {
		String s = super.toString();
		s += "\nSTUDENT ID REQUIRED";
		return s;
	}
}
