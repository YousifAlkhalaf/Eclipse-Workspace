package AP_Encoder;

import java.util.ArrayList;

public class StringCoder {

	private String masterString;

	public StringCoder(String master) {
		masterString = master;
	}

	public String decodeString(ArrayList<StringPart> parts) {
		String s = "";
		String temp = "";
		for (StringPart x : parts) {
			for (int i = x.getStart(); i < (x.getStart() + x.getLength()); i++) {
				temp += masterString.charAt(i);
			}
		}
		s += temp;
		return s;
	}

	private StringPart findPart(String str) {

		// Note: this finds the first match... not necessarily the longest match but it
		// will work
		String s = str.substring(0, 1);
		int start = masterString.indexOf(s);
		int count = 0;
		while ((count < str.length()) && (count + start < masterString.length())
				&& (str.charAt(count) == masterString.charAt(start + count))) {
			count++;
		}

		return new StringPart(start, count);

	}

	public ArrayList<StringPart> encodeString(String word) {

		ArrayList<StringPart> code = new ArrayList<StringPart>();
		for (int i = 0; word.length() > 0; i++) {
			code.add(findPart(word));
			word = word.substring(code.get(i).getLength());
		}
		return code;
	}

}
