package Assignment1A;

public class ArrayFunctionsRunner {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		ArrayWork a = new ArrayWork(arr);
		a.printArray();
		System.out.println("");
		a.printEvenIndex();
		System.out.println("");
		a.printEvenElements();
		System.out.println("");
		a.printReverseArray();
		System.out.println("");
		a.printFirstAndLast();
	}
}
