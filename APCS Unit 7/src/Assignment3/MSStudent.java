package Assignment3;

public class MSStudent extends Student {
	
	private int credits;

	public MSStudent(String name, int grade, int credits) {
		super(name, grade);
		this.credits = credits;
	}

	public boolean isPromoted() {
		if (credits >= 44) {
			return true;
		}
		return false;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public String toString() {
		String s = String.format("%s\t%d\t%d", name, grade, credits);
		return s;
	}
}
