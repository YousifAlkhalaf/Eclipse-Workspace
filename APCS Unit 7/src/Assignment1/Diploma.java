package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Diploma implements Comparable<Diploma> {

	protected String fn, ln, type;
	
	protected int id;
	private static int studentNumber = 101;

	public Diploma(String fn, String ln, String type) {
		this.fn = fn;
		this.ln = ln;
		this.type = type;
		this.id = studentNumber;
		studentNumber++;
	}
	
	public static void changeHonors (ArrayList<Diploma> diplomas, int index, String concentration) { // Basic to Honors
		Diploma old = diplomas.get(index);
		diplomas.add(index, new HonorsDiploma (old.getFirstName(), old.getLastName(), "Honors", concentration));
		diplomas.remove(index + 1);
	}

	public int compareTo(Diploma d) {
		return (this.ln.compareTo(d.ln));
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
	
	public static void findAndChange(ArrayList<Diploma> seniors, String targetName) {
		boolean nameFound = false;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < seniors.size(); i++) {
			if (seniors.get(i).getLastName().equalsIgnoreCase(targetName)) {
				nameFound = true;
				if (seniors.get(i).getType().equals("Honors")) {
					System.out.println(seniors.get(i).getFirstName() + " " + seniors.get(i).getLastName()
							+ " is now a Basic student.");
					HonorsDiploma.changeHonors(seniors, i);
				} else {
					System.out.println(seniors.get(i).getFirstName() + " " + seniors.get(i).getLastName()
							+ " is now an Honors student.");
					System.out.print("What concentration do you want this student to have? ");
					String focus = scan.next();
					Diploma.changeHonors(seniors, i, focus);
				}
			} 
		}
		if (nameFound == false)
			System.out.println("Student not found. Please try again.");
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
	
	public int getID() {
		return id;
	}
	
	public static void printDiplomaList (ArrayList<Diploma> seniors) {
		for (Diploma d : seniors) {
			System.out.println(d);
		}
	}
	
	public final static boolean passCheck(String s) {
		if (s.compareTo("CalmTrees") == 0) {
			return true;
		}
		return false;
	}
	
	public static void sortDiplomaList(ArrayList<Diploma> seniors) {
		for (int i = 0; i < seniors.size() - 1; i++) {
			int next = i;
			for (int j = i + 1; j < seniors.size(); j++) {
				if (seniors.get(j).getLastName().compareTo(seniors.get(next).getLastName()) < 0) {
					next = j;
				}
			}
			if (next != i) {
				Diploma temp = seniors.get(next);
				Diploma temp2 = seniors.get(i);
				seniors.remove(next);
				seniors.add(next, temp2);
				seniors.remove(i);
				seniors.add(i, temp);
			}
		}
	}
	
	public String toString() {
		String s = "ID" + id + " " + fn + " " + ln + ", " + type;
		return s;
	}
}
