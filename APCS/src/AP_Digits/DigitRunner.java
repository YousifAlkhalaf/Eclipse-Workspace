package AP_Digits;

public class DigitRunner {

	public static void main(String[] args) {
		
		Digits d1 = new Digits(7);
		Digits d2 = new Digits(1356);
		Digits d3 = new Digits(1336);
		Digits d4 = new Digits(1536);
		Digits d5 = new Digits(65310);
					
		System.out.println("List 1: " + d1.isStrictlyIncreasing());
		System.out.println("List 2: " + d2.isStrictlyIncreasing());
		System.out.println("List 3: " + d3.isStrictlyIncreasing());
		System.out.println("List 4: " + d4.isStrictlyIncreasing());
		System.out.println("List 5: " + d5.isStrictlyIncreasing());

	}
}
