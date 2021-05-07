package AP_StepTracker;

public class StepTracker {
	private int stepGoal, activeDays = 0, totalSteps = 0, days = 0;

	public StepTracker(int steps) {
		stepGoal = steps;
	}
	
	public int activeDays() {
		return activeDays;
	}
	
	public double averageSteps() {
		double x = totalSteps;
		double y = days;
		return x/y;
	}
	
	public void addDailySteps(int steps) {
		if (steps >= stepGoal) {
			activeDays++;
		}
		totalSteps += steps;
		days++;
	}
}
