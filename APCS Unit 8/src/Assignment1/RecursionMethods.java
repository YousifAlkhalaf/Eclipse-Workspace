package Assignment1;

public class RecursionMethods {
	public static void main (String[] args) {
		int x = multiply(0, 20);
		System.out.println(x);
		System.out.println();
		
		displayEachChar("cat");
		System.out.println();
		
		displayEachCharReverse("cat");
		System.out.println();
		
		
		System.out.printf("%d, %d, %d, %d\n", ack(0,0), ack(0,1), ack(1,1), ack(1,2));
		System.out.printf("%d, %d, %d, %d\n\n", ack(1,3), ack(2,2), ack(3,2), ack(4,0));
		
		int[] arr = new int[] {0, 3, 5, 9, 3, 7, 9, 6};
		System.out.println(maxElement(arr));
	}
	
	public static int multiply(int x, int y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		if (x == 1) {
			return y;
		}
		if (y == 1) {
			return x;
		}
		return multiply(x-1, y) + y;
	}
	
	public static void displayEachChar(String str) {
		if (str.length() > 0) {
			System.out.println(str.charAt(0));
			str = str.substring(1);
			displayEachChar(str);
		}
	}
	
	public static void displayEachCharReverse(String str) {
		if (str.length() > 0) {
			System.out.println(str.charAt(str.length()-1));
			str = str.substring(0, str.length()-1);
			displayEachCharReverse(str);
		}
	}
	
	public static int ack(int m, int n) {
		if (m == 0) {
			return n+1;
		}
		if (m > 0 && n == 0) {
			return ack(m-1, 1);
		}
		
		return ack(m-1, ack(m, n-1));
	}
	
	public static int maxElement(int[] arr) {
		if (arr.length <= 1) {
			return arr[0];
		} else {
			int i = 0;
			return maxElement(arr, arr[0], i);
		}
	}
	
	public static int maxElement(int[] arr, int greatest, int index) {
		if (index == arr.length - 1) {
			return greatest;
		}
		if (arr[index] > greatest) {
			return maxElement(arr, arr[index], index + 1);
		}
		return maxElement(arr, greatest, index + 1);
	}
}
