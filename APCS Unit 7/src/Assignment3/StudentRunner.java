package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRunner {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File("StudentData.txt"));
		ArrayList<Student> students = new ArrayList<Student>();

		while (inFile.hasNext()) {
			String name = inFile.next() + " " + inFile.next();
			int grade = inFile.nextInt();
			String info = inFile.next();

			if (info.contains("Yes")) {
				boolean willProgress = true;
				ElemStudent elem = new ElemStudent(name, grade);
				elem.setTeacherRec(willProgress);
				students.add(elem);
			} else if (info.contains("No")) {
				boolean willProgress = false;
				ElemStudent elem = new ElemStudent(name, grade);
				elem.setTeacherRec(willProgress);
				students.add(elem);
			} else {
				int credits = Integer.parseInt(info);
				if (grade < 9) {
					students.add(new MSStudent(name, grade, credits));
				} else {
					students.add(new HSStudent(name, grade, credits));
				}
			}
		}
		
		for (Student s: students) {
			System.out.println(s);
		}
		System.out.println("\n\n");

		for (Student s : students) {
			if (s.isPromoted() == true) {
				s.promote();
			}
		}

		for (Student s : students)
			System.out.printf("%s\t%d\n", s.getName(), s.getGrade());
	}
}
