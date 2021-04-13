package Assignment1B;

import java.util.Arrays;

public class ArrayMethodsRunner {
	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 20 + 1);
		}
		int[] original = Arrays.copyOf(arr, 10);

		ArrayMethods.printArray(arr);
		ArrayMethods.swapFirstAndLast(arr);
		System.out.println("\nSwapped first and last");
		ArrayMethods.printArray(arr);
		ArrayMethods.reset(arr, original);

		System.out.println("\n");
		ArrayMethods.printArray(arr);
		ArrayMethods.shiftRight(arr);
		System.out.println("\nValues shifted right");
		ArrayMethods.printArray(arr);
		ArrayMethods.reset(arr, original);

		System.out.println("\n");
		ArrayMethods.printArray(arr);
		ArrayMethods.evenToZero(arr);
		System.out.println("\nEven values converted to zero");
		ArrayMethods.printArray(arr);
		ArrayMethods.reset(arr, original);

		System.out.println("\n");
		ArrayMethods.printArray(arr);
		ArrayMethods.neighborReplace(arr);
		System.out.println("\nEach element between first and last substituted by a neighboring value");
		ArrayMethods.printArray(arr);
		ArrayMethods.reset(arr, original);

		System.out.println("\n\nThe second-largest value is " + ArrayMethods.findSecondLargest(arr));
		ArrayMethods.reset(arr, original);
		System.out.println("Sorted in increasing order? " + ArrayMethods.isIncreasing(arr));
		ArrayMethods.reset(arr, original);
		System.out.println("Two duplicate values are adjacent? " + ArrayMethods.duplicatesAdjacent(arr));
		ArrayMethods.reset(arr, original);
		System.out.println("Are there any duplicate values? " + ArrayMethods.duplicates(arr));
	}

}
