package AP_StepTracker;

public class StepTrackerRunner {

	public static void main(String[] args) {

		int x1;
		double x2;

		StepTracker tr = new StepTracker(10000);

		x1 = tr.activeDays();
		System.out.println("Active days: " + x1);

		tr.addDailySteps(9000);
		tr.addDailySteps(5000);
		x1 = tr.activeDays();
		System.out.println("Active days: " + x1);

		x2 = tr.averageSteps();
		System.out.printf("Average steps: %5.1f\n", x2);

		tr.addDailySteps(13000);
		x1 = tr.activeDays();
		System.out.println("Active days: " + x1);

		x2 = tr.averageSteps();
		System.out.printf("Average steps: %5.1f\n", x2);

		tr.addDailySteps(23000);
		tr.addDailySteps(1111);

		x1 = tr.activeDays();
		System.out.println("Active days: " + x1);

		x2 = tr.averageSteps();
		System.out.printf("Average steps: %5.1f\n", x2);

	}

}
