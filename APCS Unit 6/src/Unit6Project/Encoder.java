package Unit6Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Encoder {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File("EncoderData.txt")); // File scanner initialized

		int wordsToEncode = inFile.nextInt();
		
		for (int n = 0; n < wordsToEncode; n++) {
			// Values are pulled from a text file
			int height = inFile.nextInt();
			int length = inFile.nextInt();
			String inputString = inFile.nextLine();
			
			// Cuts off any spaces at the beginning of the word
			while (inputString.charAt(0) == ' ') {
				inputString = inputString.substring(1);
			}
			String code = encodeString(height, length, inputString);

			System.out.println(code);
			// encodeString can be used to decode Strings by inverting length and height
			// and putting in a code instead of a normal sentence
			System.out.println(encodeString(length, height, code));
			System.out.println();

		}

		// Extra example
		System.out.println(encodeString(5, 4, "Today is my birthday"));
		System.out.println(encodeString(4, 5, "Ty bho middiyraas ty"));
	}

	// Method for encoding (and decoding) strings
	public static String encodeString(int height, int length, String s) {
		char[][] matrix = new char[height][length]; // Creates array of chars
		int stringID = 0; // Index from which chars are pulled from a String
		String output = ""; // Output starts as string

		// Array moves row by row
		for (int r = 0; r < height; r++) {
			for (int c = 0; c < length; c++) {

				if (stringID >= s.length()) { // Sets unused slots to spaces
					matrix[r][c] = ' ';
					// Sets each char in the String to the array position, one by one
				} else { 
					matrix[r][c] = s.charAt(stringID);
					stringID++;
				}
			}
		}

		// Adds the characters to the output string column by column
		for (int c = 0; c < length; c++) {
			for (int r = 0; r < height; r++) {
				output += matrix[r][c];
			}
		}
		return output;
	}
}
