package Assignment1A;

public class FlipArray {
	private static void flipArray(int[] arr) {
		for (int i = 0; i < 5; i++) {
			int temp = arr[i];
			int temp2 = arr[arr.length - (i + 1)];
			int x = arr.length - (i + 1);
			arr[i] = temp2;
			arr[x] = temp;
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + ", ");
		}
		flipArray(arr);
		System.out.println("\nFlip!");
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
