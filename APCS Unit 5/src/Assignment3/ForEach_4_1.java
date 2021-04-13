package Assignment3;

public class ForEach_4_1 {
	public static void main(String[] args) {

		int[] arr = new int[10];
		int c;

		for (c = 0; c < arr.length; c++) {
			arr[c] = (int) (Math.random() * 10);
		}

		for (int num : arr) {
			System.out.printf("%d, ", num);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) { // No for-each --- Requires use of index, possible but redundant
			if (i % 2 == 0) {
				System.out.printf("%d, ", arr[i]);
			}
		}
		System.out.println();
		for (int num : arr) {
			if (num % 2 == 0) {
				System.out.printf("%d, ", num);
			}
		}
		System.out.println();
		// No for-each --- Would need to make an array to assign the reversed values to, still requires regular for-loop
		for (int i = arr.length - 1; i >= 0; i--) { 
			System.out.printf("%d, ", arr[i]);
		}
		System.out.println();
		// No point in using a loop, likely impossible with for-each
		System.out.printf("%d, %d", arr[0], arr[arr.length-1]);
	}
}
