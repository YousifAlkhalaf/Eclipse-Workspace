package Assignment1;

public class DateRunner {
	public static String friendIsOlder(Date one, Date two) {
		if (one.getYear() < two.getYear()) {
			return String.format("%s is older.", one.getName());
		}
		else if (one.getYear() == two.getYear() && one.getMonth() < two.getMonth()) {
			return String.format("%s is older.", one.getName());
		}
		else if (one.getMonth() == two.getMonth() && one.getDay() < two.getDay()) {
					return String.format("%s is older.", one.getName());
				}
		else if (one.getDay() == two.getDay()) {
			return String.format("You and your friend are the same age.");
		}
		else {
			return String.format("%s is older.",two.getName());	
			}
	}

	public static void main(String[] args) {

		Date player = new Date("Yousif Alkhalaf", 8, 13, 2005);
		Date friend = new Date("George Washington", 2, 22, 1732);

		System.out.printf("%s, %d/%d/%d\n", player.getName(), player.getMonth(), player.getDay(), player.getYear());
		System.out.printf("%s, %d/%d/%d\n", friend.getName(), friend.getMonth(), friend.getDay(), friend.getYear());
		System.out.println("");
		System.out.println(friendIsOlder(player, friend));
	}
}
