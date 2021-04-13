package Assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DiplomaRunner {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Diploma> seniors = new ArrayList<Diploma>();

		Scanner inFile = new Scanner(new File("Seniors.txt"));
		Scanner scan = new Scanner(System.in);

		while (inFile.hasNext()) {
			String values = inFile.nextLine();
			String firstName = "", lastName = "", type = "", concentration = "";

			int i = 0;

			while (values.charAt(i) != ' ') {
				firstName += values.charAt(i);
				i++;
			}
			while (values.charAt(i) == ' ') {
				i++;
			}
			while (values.charAt(i) != ' ') {
				lastName += values.charAt(i);
				i++;
			}
			while (values.charAt(i) == ' ') {
				i++;
			}
			if (values.charAt(i) == 'H') {
				type = "Honors";
				i += 6;
				while (values.charAt(i) == ' ') {
					i++;
				}
				while (i < values.length()) {
					concentration += values.charAt(i);
					i++;
				}
			} else {
				type = "Basic";
				i += 5;
			}

			if (type.equals("Basic"))
				seniors.add(new Diploma(firstName, lastName, type));
			else if (type.equals("Honors"))
				seniors.add(new HonorsDiploma(firstName, lastName, type, concentration));
		}

		Collections.sort(seniors);

		for (Diploma d : seniors) {
			System.out.println(d);
		}
		System.out.println();

		boolean nameFound = false;
		boolean isDone = false;

		while (isDone == false) {
				System.out.print("Write the last name of the student you want to edit. Say \"No\" to opt out. ");
				String targetName = scan.next();

				if (targetName.equalsIgnoreCase("No")) {
					isDone = true;
				} else {
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
		}
		System.out.println();
		for (Diploma d : seniors) {
			System.out.println(d);
		}
		int x = Diploma.countBasicNum(seniors);
		int y = Diploma.countHonorsNum(seniors);
		System.out.println();
		System.out.printf("%d basic students, %d honors students", x, y);
	}
}