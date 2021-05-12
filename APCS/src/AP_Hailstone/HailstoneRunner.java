package AP_Hailstone;

public class HailstoneRunner {

	public static void main(String[] args) {

		int[] values = { 5, 8, 1, 14 };

		for (int value : values) {
			int hs = Hailstone.hailstoneLength(value);
			System.out.printf("The length starting at %d is %d\n", value, hs);
		}

		System.out.println();

		for (int value : values) {
			if (Hailstone.isLongSeq(value))
				System.out.printf("The length starting at %d is long\n", value);
			else
				System.out.printf("The length starting at %d is NOT long\n", value);
		}

		System.out.println();

		double proportion = Hailstone.propLong(10);
		System.out.printf("The proportion of sequences from 1 to 10 that are long is %3.2f\n", proportion);

		proportion = Hailstone.propLong(100);
		System.out.printf("The proportion of sequences from 1 to 100 that are long is %3.2f\n", proportion);

	}

}
