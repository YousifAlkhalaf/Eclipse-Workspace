package Assignment3;

public class FindLargestOverload {
	public static String findLargest(int x, int y) {
		if (x > y)
			return String.format("Method 1:  " + x + " is the larger value");
		else
			return String.format("Method 1:  " + y + " is the larger value");
	}

	public static String findLargest(int x, int y, int z) {
		if (x > y && x > z)
			return String.format("Method 2:  " + x + " is the largest value");
		else if (y > x && y > z)
			return String.format("Method 2:  " + y + " is the largest value");
		else
			return String.format("Method 2:  " + z + " is the largest value");
	}

	public static String findLargest(double x, double y) {
		if (x > y)
			return String.format("Method 3:  " + x + " is the largest value");
		else
			return String.format("Method 3:  " + y + " is the largest value");
	}

	public static String findLargest(double x, double y, double z) {
		if (x > y && x > z)
			return String.format("Method 4:  " + x + " is the largest value");
		else if (y > x && y > z)
			return String.format("Method 4:  " + y + " is the largest value");
		else
			return String.format("Method 4:  " + z + " is the largest value");
	}
	
	public static void main (String[] args) {
		System.out.print(findLargest(2, 6));
		System.out.println("");
		System.out.print(findLargest(2, 6, 4));
		System.out.println("");
		System.out.print(findLargest(2.3, 6.5));
		System.out.println("");
		System.out.print(findLargest(2.2, 6.9, 4.7));
	}
}
