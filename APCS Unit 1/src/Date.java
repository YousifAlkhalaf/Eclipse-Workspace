public class Date {
	public static void main(String[] args) {
		
		String day = "Wednesday";
		String month = "October";
		short date = 21;
		short year = 2020;
		System.out.println("The current date, in American format, is:");
		System.out.print(day + ", " + month + " " + date + ", " + year);
		System.out.print("\n\n");
		
		System.out.println("The current date, in European format, is:");
		System.out.print(day + " " + date + " " + month + " " + year);
		
	}
}