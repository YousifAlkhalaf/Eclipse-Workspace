package Assignment2;

public class RecursiveBinSearch {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 4, 6, 7, 10, 22, 33, 45, 89, 102, 117, 121, 200 };
		int t1 = 89, t2 = 6;

		int y = binSearch(arr, t1, 0, arr.length - 1);
		int z = binSearch(arr, t2, 0, arr.length - 1);
		System.out.println(printSearchFind(y, t1));
		System.out.println(printSearchFind(z, t2));
	}

	public static int binSearch(int[] arr, int target, int start, int end) {
		int median = (start + end) / 2;
		if (median >= arr.length - 1) {
			median = arr.length - 2;
		}
		if (median <= 0) {
			median = 1;
		}
		if (target == arr[median])
			return median;
		if (start < end) {
			if (target > arr[median]) {
				start = median + 1;
			} else if (target < arr[median]) {
				end = median - 1;
			}
			return binSearch(arr, target, start, end);
		} else if (arr[median - 1] == target) {
			return median - 1;
		} else if (arr[median + 1] == target) {
			return median + 1;
		} else {
			return -1;
		}
	}

	public static String printSearchFind(int x, int target) {
		if (x == -1) {
			return String.format("%d is not found in the array\n", target);
		} else {
			return String.format("%d is element %d in the array\n", target, x);
		}
	}
}
