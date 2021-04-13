package Assignment1;

public class Date {
	// first list your attributes (field variables)
	private int year;
	private int month;
	private int day;
	private String name;

	public Date(String name, int month, int day, int year) {
		this.name = name;
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public Date(String name) {
		this.name = name;
		month = 1;
		day = 1;
		year = 2020;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public int getYear() {
		return this.year;
	}
	public String getName() {
		return this.name;
	}
}
