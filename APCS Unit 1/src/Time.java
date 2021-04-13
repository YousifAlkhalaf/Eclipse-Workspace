public class Time {
	public static void main(String[] args) {

		final int SECONDS_IN_DAY = 86400;
		int hour = 11;
		int minute = 9;
		int second = 59;
		System.out.print("The current time is ");
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		System.out.print(":");
		System.out.print(second);
		System.out.println(".\n");
		
		int secondsRemaining = SECONDS_IN_DAY - (3600 * hour) - (60 * minute) - second;
		int secondsPassed = (3600 * hour) + (60 * minute) + second;
		double secondsPassedPercent = 100*((double)secondsPassed/SECONDS_IN_DAY);
		
		System.out.println("Seconds passed: " + secondsPassed + " seconds.\n");
		System.out.println("Amount of day passed, in percent: " + secondsPassedPercent + "%.\n");
		System.out.println("Seconds remaining: " + secondsRemaining + " seconds.\n");
		
		final int STARTING_TIME = (3600 * hour) + (60 * minute) + second;
		int currentHour = 11;
		int currentMinute = 13;
		int currentSecond = 55;
		final int CURRENT_TIME = (3600 * currentHour) + (60 * currentMinute) + currentSecond; 
		final int ELAPSED_TIME = CURRENT_TIME - STARTING_TIME;
		
		System.out.println("Time elapsed, in seconds: " + ELAPSED_TIME + " seconds.");			
			
	}
}
