import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		// 3600 is the seconds per hour, 60 is the seconds per minute
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a value, in seconds that you want converted:");
		int origin = scan.nextInt();

		double hour = origin / 3600;
		double minuteRaw = origin % 3600;
		double minute = minuteRaw / 60;
		double second = minuteRaw % 60;
		
		System.out.printf("%.0f hour(s), %.0f minute(s), and %.0f second(s).", hour, minute, second);
		
		scan.close();
	}
}
