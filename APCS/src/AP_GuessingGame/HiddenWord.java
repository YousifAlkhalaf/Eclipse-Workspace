package AP_GuessingGame;

public class HiddenWord {

	private String word;

	public HiddenWord(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public String getHint(String guess) {
		String hint = "";
		boolean isPresent = false;

		for (int i = 0; i < guess.length(); i++) {
			for (int n = 0; n < word.length(); n++) {
				if (guess.charAt(i) == word.charAt(n)) {
					isPresent = true;
					if (i == n) {
						hint += guess.charAt(i);
					} else {
						hint += '+';
					}
				}
			}
			if (isPresent == false) {
				hint += '*';
			}
			isPresent = false;
		}

		return hint;
	}
}
