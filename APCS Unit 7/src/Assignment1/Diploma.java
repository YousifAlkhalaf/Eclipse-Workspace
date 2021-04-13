package Assignment1;

import java.util.ArrayList;

public class Diploma implements Comparable<Diploma> {

	protected String fn, ln, type;

	public Diploma(String fn, String ln, String type) {
		this.fn = fn;
		this.ln = ln;
		this.type = type;
	}

	public String toString() {
		String s = fn + " " + ln + ", " + type;
		return s;
	}

	public int compareTo(Diploma d) {
		return (this.ln.compareTo(d.ln));
	}
	
	public String getLastName () {
		return ln;
	}
	
	public String getFirstName () {
		return fn;
	}
	
	public String getType () {
		return type;
	}
	
	public static void changeHonors (ArrayList<Diploma> diplomas, int index, String concentration) { // Basic to Honors
		Diploma old = diplomas.get(index);
		diplomas.add(index, new HonorsDiploma (old.getFirstName(), old.getLastName(), "Honors", concentration));
		diplomas.remove(index + 1);
	}
	
	public static int countBasicNum(ArrayList<Diploma> diplomas) {
		int basicNum = 0;
		for (Diploma d: diplomas) {
			if (d.getType().equals("Basic")) {
				basicNum++;
			}
		}
		return basicNum;
	}
	
	public static int countHonorsNum(ArrayList<Diploma> diplomas) {
		int honorsNum = 0;
		for (Diploma d: diplomas) {
			if (d.getType().equals("Honors")) {
				honorsNum++;
			}
		}
		return honorsNum;
	}
}