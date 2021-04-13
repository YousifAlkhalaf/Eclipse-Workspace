import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		double celsius;
		System.out.println("What is the temperature, in Celsius?");
		celsius = scan.nextDouble();
		
		double fahrenheit = celsius * ((double)9/5) + 32;
		
		System.out.printf("The temperature is currently %.1f degrees Fahrenheit", fahrenheit);
		
		scan.close();
	}
}
