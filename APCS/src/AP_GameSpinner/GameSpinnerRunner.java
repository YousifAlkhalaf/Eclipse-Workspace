package AP_GameSpinner;

public class GameSpinnerRunner {

	public static void main(String[] args) {

		GameSpinner g = new GameSpinner(4);

		System.out.println(g.currentRun());
		for (int i = 0; i < 20; i++) {
			System.out.print(g.spin() + "    ");
			System.out.println(g.currentRun());
		}
	}
}
