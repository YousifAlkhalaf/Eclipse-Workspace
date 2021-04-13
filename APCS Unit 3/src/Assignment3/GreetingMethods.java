package Assignment3;

public class GreetingMethods {
	public static String greet(String name, String surname) {
		return String.format("Dear %s %s,", name, surname);
	}
	public static String greet(String name) {
		return String.format("Dear %s,", name);
	}
	public static void main (String[] args) {
		System.out.println(greet("Santa"));
		System.out.println(greet("Santa", "Claus"));
	}
}
