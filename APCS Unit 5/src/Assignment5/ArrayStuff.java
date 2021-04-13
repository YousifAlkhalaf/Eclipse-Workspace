package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class ArrayStuff {
	public static void main(String[] args) {

		ArrayList<Integer> x = new ArrayList<Integer>();

		// Set to random numbers
		for (int i = 0; i < 10; i++) {
			double value = Math.random() * 10;
			x.add((int)value);
		}
		System.out.println("Starting list: " + x);
		System.out.println();
		
		// Reverse
		for (int i = 0; i < (x.size()/2); i++) {
			int i2 = x.size()-1 - i;
			int temp = x.get(i);
			x.set(i, x.get(i2));
			x.set(i2, temp);
		}
		System.out.println("Reversed: " + x);
		
		// Add 100
		x.add(0, 100);
		System.out.println("\n100 added in the front: " + x);
		
		// Copy original array
		ArrayList<Integer> y = new ArrayList<Integer>(x);
		
		// Delete every other array
		for (int i = 0; i < x.size(); i++) {
			x.remove(i);
		}
		System.out.println("\nEvery other element deleted: " + x);
		System.out.println("Origianl Array: " + y);
	}
}
