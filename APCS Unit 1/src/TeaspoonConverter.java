import java.util.Scanner;

public class TeaspoonConverter {
	public static void main (String[] args) {
		
		/* 768 is teaspoons per gallon, 192 is teaspoons per quart, 
		48 is teaspoons per cup, and 3 is teaspoons per tablespoon */ 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("How many teaspoons are there? ");
		int origin = scan.nextInt();
		
		double gallon = origin / 768;
		double origin2 = origin % 768;
		double quart = origin2 / 192;
		double origin3 = origin2 % 192;
		double cup = origin3 / 48;
		double origin4 = origin3 % 48;
		double tablespoon = origin4 / 3;
		double teaspoon = origin4 % 3;
		
		gallon = Math.floor(gallon);
		quart = Math.floor(quart);
		cup = Math.floor(cup);
		tablespoon = Math.floor(tablespoon);
		teaspoon = Math.floor(teaspoon);
		
		System.out.printf("You have %.0f gallon(s), %.0f quart(s),"
				+ " %.0f cup(s), %.0f tablespoon(s), and %.0f teaspoon(s).",
				+ gallon, quart, cup, tablespoon, teaspoon);

		scan.close();
	}
}
