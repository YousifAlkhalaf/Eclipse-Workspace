package ListTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1Runner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File("data.txt"));

		ArrayList<Plane> planeRoster = new ArrayList<Plane>();
		planeRoster.add(
				new Plane(inFile.nextInt(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt()));
		planeRoster.add(
				new Plane(inFile.nextInt(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt()));
		planeRoster.add(
				new Plane(inFile.nextInt(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt()));

		Scanner update = new Scanner(new File("PlaneUpdate.txt"));
		while (update.hasNext()) {
			Plane temp = new Plane(update.nextInt(), update.nextInt(), update.nextInt(), update.nextInt(),
					update.nextInt());
			updateList(temp, planeRoster);
		}

		for (int i = 0; i < planeRoster.size(); i++) {
			if (planeRoster.get(i).okayToLand() == false) {
				System.out.println("Aircraft " + planeRoster.get(i).getPlaneNum() + ", Abort Landing!");
			} else {
				System.out.println("Aircraft " + planeRoster.get(i).getPlaneNum() + ", Clear To Land");
			}
		}
	}

	public static void updateList(Plane p, ArrayList<Plane> planeRoster) throws FileNotFoundException {
		for (int i = 0; i < planeRoster.size(); i++) {
			if (p.getPlaneNum() == planeRoster.get(i).getPlaneNum()) {
				planeRoster.add(i, p);
				planeRoster.remove(i + 1);
			}
		}
	}
}
