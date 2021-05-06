package AP_Trails;

public class TrailRunner {
	public static void main(String[] args) {

		int[] trail1 = { 100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100 };
		Trail testTrail = new Trail(trail1);

		testTrail.printMarkers(); // prints out the trail elevations just to check
		System.out.println("TRAIL 1");

		System.out.printf("The trail is level:  %b\n", testTrail.isLevelTrailSegment(7, 10));
		// output should be true

		System.out.printf("The trail is level:  %b\n", testTrail.isLevelTrailSegment(2, 12));
		// output should be false

		System.out.println();

		System.out.printf("The trail is difficult:  %b\n", testTrail.isDifficult());
		// output should be true

		int[] trail2 = { 0, 20, 40, 40, 30, 15, 10, 40, 80, 90, 100 };
		Trail testTrail2 = new Trail(trail2);

		testTrail2.printMarkers();
		System.out.println("TRAIL 2");

		System.out.printf("The trail is level:  %b\n", testTrail2.isLevelTrailSegment(7, 10));
		// output should be false

		System.out.printf("The trail is level:  %b\n", testTrail2.isLevelTrailSegment(2, 4));
		// output should be true

		System.out.println();

		System.out.printf("The trail is difficult:  %b\n", testTrail2.isDifficult());
		// output should be false

	}

}
