package Assignment5;

import java.util.List;
import java.util.ArrayList;

public class Unicorn {
	public static void main(String[] args) {

		List<String> teamUnicorn = new ArrayList<String>();
		teamUnicorn.add ("Bob");
		teamUnicorn.add ("Susan");
		teamUnicorn.add ("Barbara");
		
		System.out.println(teamUnicorn.get(1));
		
		teamUnicorn.add(1, "Pat");
		int num = teamUnicorn.indexOf("Susan");
		num = teamUnicorn.indexOf("Billy");
		teamUnicorn.add(2, "theGOAT");
		teamUnicorn.set(teamUnicorn.indexOf("Bob"), "Larry");
		
	}
}
