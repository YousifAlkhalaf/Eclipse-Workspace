package AP_SeatingChart;

public class Student {

	String name;
	int numAbsences;
	
	public Student(String name, int x)  {
		numAbsences = x;
		this.name = name;
	}
	
	public String getName()  {
		return name;
	}
	
	public int getAbsenceCount()  {
		return numAbsences;
	}

}
