package Assignment2;

public class TestArray2D {
	public static void main(String[] args) {

		String[] answerKey = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
		String[][] grades = { { "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
				{ "D", "B", "A", "B", "C", "A", "E", "E", "A", "D" },
				{ "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
				{ "C", "B", "A", "E", "D", "C", "E", "E", "A", "D" },
				{ "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" },
				{ "B", "B", "E", "C", "C", "D", "E", "E", "A", "D" },
				{ "E", "B", "D", "C", "A", "D", "A", "E", "A", "D" },
				{ "E", "B", "E", "C", "C", "D", "E", "E", "A", "D" } };

		int student = 0;
		int ans = 0;
		int correctAnswers = 0;

		for (student = 0; student < grades.length; student++) {
			for (ans = 0; ans < grades[student].length; ans++) {
				if (grades[student][ans].equals(answerKey[ans])) {
					correctAnswers++;
				}
			}
			System.out.printf("Student %d: %d correct answers\n", student + 1, correctAnswers);
			correctAnswers = 0;
		}
	}
}
