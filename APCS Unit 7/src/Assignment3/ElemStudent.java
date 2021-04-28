package Assignment3;

public class ElemStudent extends Student {

	private boolean teacherRec;

	public ElemStudent(String name, int grade) {
		super(name, grade);
		teacherRec = true; // default is that student should be promoted
	}

	public boolean isPromoted() {
		return (teacherRec); // if teacherRec is true, the student should be promoted

	}

	public void setTeacherRec(boolean recommendation) {
		teacherRec = recommendation;
	}
	
	public boolean getTeacherRec() {
		return teacherRec;
	}
	
	public String toString() {
		String s = String.format("%s\t%d\t", name, grade);
		if (teacherRec == true) {
			s += "Yes";
		} else {
			s += "No";
		}
		return s;
		
	}

}
