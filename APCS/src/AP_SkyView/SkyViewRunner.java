package AP_SkyView;

public class SkyViewRunner {
	public static void main(String[] args) {
		// ************* Testing the constructor method ****************//

		double[] scanned = { 0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9 };

		SkyView sky1 = new SkyView(4, 3, scanned);

		// print out the array to make sure it was read in correctly
		System.out.print(sky1);

		double[] scanned2 = { 0.3, 0.7, 0.8, 0.4, 1.4, 1.1 };
		SkyView sky2 = new SkyView(3, 2, scanned2);
		System.out.println(sky2);

		// ********* Testing the getAverage Method **********//

		double avg1 = sky1.getAverage(1, 2, 0, 1);
		System.out.println("The average for sky 1 is " + avg1);
		System.out.println("Your value should be " + (1.1 + 1.4 + 0.2 + 0.5) / 4 + "\n");

		double avg2 = sky2.getAverage(0, 1, 1, 1);
		System.out.println("The average for sky 2 is " + avg2);
		System.out.println("Your value should be " + (0.7 + 0.8) / 2);
	}

}
