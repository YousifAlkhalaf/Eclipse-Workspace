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

		// Collections.sort(seniors);

		Diploma.sortDiplomaList(seniors);

		Diploma.printDiplomaList(seniors);
		System.out.println();

		boolean isDone = false;
		boolean hasAccess = false;

		while (isDone == false) {
			System.out.print("Write the last name of the student you want to edit. Say \"No\" to opt out. ");
			String targetName = scan.next();

			if (targetName.equalsIgnoreCase("No")) {
				isDone = true;
			} else if (hasAccess == true) {
				Diploma.findAndChange(seniors, targetName);
			} else {
				while (hasAccess == false) {
					System.out.print("Enter the password in order to change the diplomas. Say \"No\" to quit: ");
					String s = scan.next();
					if (s.compareToIgnoreCase("No") == 0) {
						isDone = true;
					} else {
						hasAccess = Diploma.passCheck(s);
						if (hasAccess == true) {
							Diploma.findAndChange(seniors, targetName);
						} else {
							System.out.println("Incorrect password");
						}
					}
				}
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
