package Assignment1B;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IM1Student {

	private int[] id, firstScore, retakeScore;

	public IM1Student(int[] id, int[] firstScore, int[] retakeScore) throws FileNotFoundException {
		this.id = id;
		this.firstScore = firstScore;
		this.retakeScore = retakeScore;
	}

	public int retakerAmount() {
		int num = 0;
		for (int newScore : retakeScore) {
			if (newScore != -1) {
				num++;
			}
		}
		return num;
	}

	public int amountImproving() {
		int num = 0;
		for (int i = 0; i < id.length; i++) {
			if (firstScore[i] < retakeScore[i] && retakeScore[i] != -1) {
				num++;
			}
		}
		return num;
	}

	public double boostAverage() {
		double average = 0;
		int retakes = 0;
		for (int i = 0; i < id.length; i++) {
			if (retakeScore[i] != -1)
			average += (retakeScore[i] - firstScore[i]);
		}
		average /= retakerAmount();
		return average;
	}
}
