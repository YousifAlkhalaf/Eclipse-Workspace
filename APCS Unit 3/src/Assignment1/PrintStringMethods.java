package Assignment1;

public class PrintStringMethods {

	public static void printString (String s, int printAmnt) {
		for (; printAmnt > 0; printAmnt--) {
			System.out.println (s);
		}
	}
	public static void main (String[] args) {
		printString("Happy Holidays!", 8);
	}
}
