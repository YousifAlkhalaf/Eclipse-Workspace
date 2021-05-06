package AP_Phrase;

public class Phrase {

	private String currentPhrase;

	public Phrase(String p) {
		currentPhrase = p;
	}

	// ----------------------------------------------

	public void replaceNthOccurrence(String str, int n, String repl) {
		String phrase = currentPhrase;
		int whereToChange = 0;
		int index = 0;

		while (n > 0) {
			index = phrase.indexOf(str);
			whereToChange += index;
			if (index == -1) {
				whereToChange = -1;
				break;
			}
			if (n == 1) {
				break;
			} else {
				n--;
				phrase = phrase.substring(index + 1);
				whereToChange++;
			}
		}

		if (whereToChange != -1) {
			currentPhrase = currentPhrase.substring(0, whereToChange) + repl
					+ currentPhrase.substring(whereToChange + str.length());
		}

	}

	// ----------------------------

	public int findLastOccurence(String str) {
		String phrase = currentPhrase;
		int lastInstance = 0, index = 0, numOfRuns = 0;

		while (true) {
			index = phrase.indexOf(str);
			lastInstance += index + 1;
			if (index == -1) {
				break;
			}
			phrase = phrase.substring(index + 1);
			numOfRuns++;
		}
		
		if (lastInstance == -1 && numOfRuns == 0) {
			return -1;
		} else {
			return lastInstance - 1;
		}

	}

	// ---------------------------

	public String toString() {

		return currentPhrase;

	}

}
