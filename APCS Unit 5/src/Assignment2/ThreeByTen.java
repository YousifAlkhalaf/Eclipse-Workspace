package Assignment2;

public class ThreeByTen {
	public static void main(String[] args) {
		int[][] arr = new int[3][10];
		int count = 3;
		int r = 0;
		int c = 1;

		for (r = 0; r < arr.length; r++) {
			arr[r][0] = r * 2;
			for (c = 1; c < arr[r].length; c++) {
				arr[r][c] = arr[r][0] + count;
				count += 3;
			}
			count = 3;
		}

		for (r = 0; r < arr.length; r++) {
			for (c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + ", " );
			}
			System.out.println();
		}

	}

}
