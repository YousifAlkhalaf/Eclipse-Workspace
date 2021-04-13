package Assignment3;

public class PrintNames {
	public static void main(String[] args) {

		String[] names = {"Ethan", "Jonah", "Anna", "Amelia", "Edward"};

		for (String student : names) {
			System.out.printf("%s, ", student);
		}
	}
}
