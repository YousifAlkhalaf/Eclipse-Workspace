package Assignment1A;

public class Index {
	
	public static int indexOfMax (int[] arr) {
		int[] indexNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int largestValue = 0;
		int i = 0;
		int largestIndex = 0;
		for (int num : arr) { // Enhanced for loop
			if (num > largestValue) {
				largestValue = num;
				largestIndex = indexNum[i];
			}
			i++;
			//System.out.println(num);
		}
		return largestIndex;
	}

	public static void main (String[] args) {
		
		int [] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random()*20 + 1);
		}
		
		System.out.println("The largest element in the array is at index value " + indexOfMax(arr));
	}
}
