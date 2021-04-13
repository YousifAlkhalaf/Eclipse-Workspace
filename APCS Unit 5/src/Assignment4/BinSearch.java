package Assignment4;

public class BinSearch {
	public static int find(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int median = 0;
		while (start < end)  {
			median = (start + end) / 2;

			if (target == arr[median]) {

				return median;
			} else if (target > arr[median]) {
				start = median + 1;
			} else if (target < arr[median]) {
				end = median - 1;
			}
		}
		if (arr[median - 1] == target) {
		return median - 1;
	} else if (arr[median + 1] == target) {
			return median + 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 11, 13, 14, 15, 16, 18, 19, 20, 22, 23, 25};
		int x = 0, i = 0;
		for (i = 0; i <= 25; i++) {
			x = BinSearch.find(arr, i);
			if (x == -1) {
				System.out.printf("%d is not found in the array\n", i);
			} else {
				System.out.printf("%d is element %d in the array\n", i, x);
			}
		}
	}
}
