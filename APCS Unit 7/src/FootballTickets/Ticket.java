package FootballTickets;

public class Ticket {

	private String name;
	private int daysInAdvance, ticketSerial;
	private double cost;
	private static int serialNum = 1000;

	public Ticket(String name, int days) {
		this.name = name;
		this.daysInAdvance = days;
		this.ticketSerial = serialNum;
		serialNum++;

		if (this.daysInAdvance > 7) {
			this.cost = 7.5;
		} else {
			this.cost = 10;
		}
	}

	public Ticket() {
	}

	public void studentDiscount() {
		cost /= 2;
	}
	
	public String toString() {
		String s = String.format("Name: %s   Cost: $%.2f   Serial#: %d", this.name, this.cost, this.ticketSerial);
		return s;
	}

}
