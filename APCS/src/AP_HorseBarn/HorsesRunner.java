package AP_HorseBarn;

public class HorsesRunner {

	public static Horse[] spaces = new Horse[7];
	
	public static void main(String[] args) {
		// initialize the array
		
		spaces[0] = new Horse("Trigger");
		spaces[1] = null;
		spaces[2] = new Horse("Silver");
		spaces[3] = new Horse("Lady");
		spaces[4] = null;
		spaces[5] = new Horse("Patches");
		spaces[6] = new Horse("Duke");

		printBarn(spaces);
		System.out.println();
		
		System.out.println("Check your output for part a");
		System.out.println("Expecting 0  2  -1");
		int x = findHorseSpace("Trigger");
		System.out.println(x);
		x = findHorseSpace("Silver");
		System.out.println(x);
		x = findHorseSpace("Coco");
		System.out.println(x); 
		
		System.out.println("Checking part b");
		System.out.println(("Expecting Trigger Silver Lady Patches Duke null null"));
		consolidate();
		printBarn(spaces);
		
	}

	//----------------------------------------------------------
	
	public static void printBarn(Horse[] barn)  {
		
		for (int i = 0; i < barn.length; i++)  {
			if (barn[i] != null)
				System.out.print(" " + barn[i].getName() + "  ");
			else System.out.print("null  ");
		}
		System.out.println();
	}
	
	//-------------------------------------------------------
	
	
	public static int findHorseSpace (String name)  {

		// code for part a goes here
	}
	
	
	// -------------------------------------------------------
	
	public static void consolidate()  {
		
		// code for part b goes here
	}
}

