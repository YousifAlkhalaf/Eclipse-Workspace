package Array_Review_2;

public class AP_Array {
	public static void main(String[] args) {

		int[] test_arr = { 4, 1, 3, 6, 2, 9 };

		System.out.println(divBySum(test_arr, 3));
		System.out.println(divBySum(test_arr, 5));

	}

	public static int divBySum(int[] arr, int num) {
		int sum = 0;
		for (int x: arr) {
			if (x % num == 0) {
				sum += x;
			}
		}
		return sum;
	}

}
