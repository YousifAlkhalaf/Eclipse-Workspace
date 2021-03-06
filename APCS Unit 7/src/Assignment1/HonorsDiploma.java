package Assignment1;

import java.util.ArrayList;

public class HonorsDiploma extends Diploma{

	protected String focus;
	
	public HonorsDiploma(String fn, String ln, String type, String focus) {
		super(fn, ln, type);
		this.focus = focus;
	}
	
	public static void changeHonors (ArrayList<Diploma> diplomas, int index) { // Honors to basic
		Diploma old = diplomas.get(index);
		diplomas.add(index, new Diploma (old.getFirstName(), old.getLastName(), "Basic"));
		diplomas.remove(index + 1);
	}
	
	public int getID() {
		return super.getID();
	}

	public String getConcentration() {
		return focus;
	}
	
	public String toString() {
		String s = "ID" + super.getID() + ' ' + fn + " " + ln + ", " + type + ", " + focus;
		return s;
	}
	
}
