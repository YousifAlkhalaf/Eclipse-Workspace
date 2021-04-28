package Assignment3;

public class HSStudent extends Student {

	private int credits;

	public HSStudent(String name, int grade, int credits) {
		super(name, grade);
		this.credits = credits;
	}

	public boolean isPromoted() {
		if ((grade == 9) && (credits >= 50)) {
			return true;
		} else if ((grade == 10) && (credits >= 110)) {
			return true;
		} else if ((grade == 11) && (credits >= 170)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getCredits() {
		return credits;
	}
	
	public String toString() {
		String s = String.format("%s\t%d\t%d", name, grade, credits);
		return s;
	}
}
