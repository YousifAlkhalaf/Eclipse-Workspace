package AP_NewDigits;

public class DigitsRunner {

	public static void main(String[] args)  {
		
	boolean inc;
	
	inc = new Digits(7).isStrictlyIncreasing();
	System.out.println(inc);
	
	inc = new Digits(1356).isStrictlyIncreasing();
	System.out.println(inc);
	
	inc = new Digits(1336).isStrictlyIncreasing();
	System.out.println(inc);
	
	inc = new Digits(1536).isStrictlyIncreasing();
	System.out.println(inc);
	
	inc = new Digits(65310).isStrictlyIncreasing();
	System.out.println(inc);
	
	
	
	}
}

