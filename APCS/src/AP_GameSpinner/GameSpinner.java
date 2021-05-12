package AP_GameSpinner;

public class GameSpinner {

	private int[] sectors;
	private static int priorValue = 0;
	private static int numInSuccession = 0;

	public GameSpinner(int numOfSectors) {
		sectors = new int[numOfSectors];
		for (int i = 0; i < sectors.length; i++) {
			sectors[i] = i + 1;
		}
	}

	public int spin() {
		int num = (int) (Math.random() * 4 + 1);
		if (priorValue == 0) {
			numInSuccession = 1;
		} else if (priorValue == num) {
			numInSuccession++;
		} else {
			numInSuccession = 1;
		}
		priorValue = num;
		return num;
	}

	public int currentRun() {
		return numInSuccession;
	}
}
