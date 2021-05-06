package Array_Review_2;

public class Problem2 {
	public static void main(String[] args) {
		int[][] input = { { 2, 4, 6, 9, -1, 4, 40 }, { 6, 8, -2, 18, 27, 1, 9 }, { 9, 8, -5, -4, -3, -2, -1 },
				{ 5, 54, 54, 6, 8, 1, 1 } };
		int[] greatestNums = new int[input.length];

		for (int k = 0; k < input.length; k++) {
			for (int j = 0; j < input[k].length; j++) {
				System.out.printf("%d, ", input[k][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int k = 0; k < input.length; k++) {
			greatestNums[k] = input[k][0];
			for (int j = 0; j < input[k].length; j++) {
				if (input[k][j] > greatestNums[k]) {
					greatestNums[k] = input[k][j];
				}
			}
		}
		
		for (int i = 0; i < greatestNums.length; i++) {
			System.out.print(greatestNums[i] + ", ");
		}
	}
}
