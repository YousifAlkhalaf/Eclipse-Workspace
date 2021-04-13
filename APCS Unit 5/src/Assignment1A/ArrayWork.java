package Assignment1A;

public class ArrayWork {

	private static int[] arr;

	public ArrayWork(int[] arr) {
		ArrayWork.arr = arr;
	}

	public void printArray() {
		System.out.print("First function: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
	}

	public void printEvenIndex() {
		System.out.print("Second function: ");
		for (int i : arr) { // LOOK HERE RICHMOND
			if (i % 2 == 0) {
				System.out.print(i);
				System.out.print(", ");
			}
		}
	}
	
	public void printEvenElements() {
		System.out.print("Third function: ");
		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i]);
				System.out.print(", ");
			}
		}
	}
	
	public void printReverseArray() {
		System.out.print("Fourth function: ");
		for (int i = 9; i >= 0; i--) {
			System.out.print(arr[i]);
			System.out.print(", ");
		}
	}
	public void printFirstAndLast() {
		System.out.print("Fifth function: ");
		System.out.print(arr[0] + ", ");
		System.out.print(arr[arr.length-1]);
	}
}
