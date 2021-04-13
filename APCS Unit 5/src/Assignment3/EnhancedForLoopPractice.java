package Assignment3;

public class EnhancedForLoopPractice {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int c, sum = 0;
		
		for (c = 0; c < arr.length; c++) {
			arr[c] = (int) (Math.random() * 10);
		}
		
		for (int num: arr) {
			System.out.printf("%d, ", num);
		}
		
		for (int num: arr) {
			sum += num;
		}
		
		System.out.printf("\nSum: %d", sum);
	}
}
