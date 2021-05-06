package AP_Digits;

import java.util.ArrayList;

public class Digits {

	private ArrayList<Integer> digitList;

	public Digits(int num) {

		digitList = new ArrayList<Integer>();

		while (num > 0) {
			digitList.add(0, num % 10);
			num /= 10;
		}
		
// If num is 1 digit, add and quit
// If >1 digit, use while loop
// num % 10 = remainder = last digit
// Add digit to list
// Int division: num/10 will give remaining
// repeat so long as num > 0
		
	}

	public boolean isStrictlyIncreasing() {
		if (digitList.size() == 1) {
			return true;
		}
		for (int i = 0; i < digitList.size() - 1; i++) {
			if (digitList.get(i) >= digitList.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

}
