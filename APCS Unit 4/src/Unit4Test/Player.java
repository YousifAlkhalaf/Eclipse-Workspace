package Unit4Test;

public class Player {
	private int position = 0;
	private String color;

	public Player(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void move(int num) {
		if (num < 6) {
			this.position += num;
		} else {
			this.position -= num;
			if (this.position < 0) {
				this.position = 0;
			}
		}
	}

	public int getPosition() {
		return this.position;
	}

	public boolean checkWinner() {
		if (this.position >= 15) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return String.format("The %s player is at position %d", color, position);
	}
}
