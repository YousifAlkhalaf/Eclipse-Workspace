package Assignment3;

public abstract class Student {

	String name;
	int grade;

	// --------- Constructor ----------------
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade; // use 0 for kindergarten
	}

	// Setters and getters not shown

	// -------Abstract method that will be written in subclass code ----

	abstract public boolean isPromoted();

//----------------------------------------------------------
	// Updates information so student is promoted to the next grade.
	// Only eligible for students in grade K - 11.
	// We would use a different method for graduating seniors.

	public void promote() {
		grade++;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getName() {
		return name;
	}
}
