package AP_Hailstone;

public class Hailstone {

	public static int hailstoneLength (int n) {
		int length = 1;
		while (n > 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			}
			length++;
		}
		return length;
	}
	
	public static boolean isLongSeq (int n) {
		if (hailstoneLength(n) > n) {
			return true;
		}
		return false;
	}
	
	public static double propLong (int n) {
		int longSeqs = 0;
		for (int i = 1; i <= n; i++) {
			if (isLongSeq(i)) {
				longSeqs++;
			}
		}
		return (double) longSeqs/ (double) n;
	}
}
