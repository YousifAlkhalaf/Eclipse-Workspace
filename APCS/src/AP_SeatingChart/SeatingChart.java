package AP_SeatingChart;

import java.util.List;

public class SeatingChart {

	private Student[][] seats;
//-------------------------------------------------------------------------------------------
	
	public SeatingChart(List<Student> studentList, int rows, int cols)  {
		
		// to be completed in part a
		seats = new Student[rows][cols];
		int index = 0;
		for (int c = 0; c < cols; c++) {
			for (int r = 0; r < rows; r++) {
				if (index < studentList.size()) {
					seats[r][c] = studentList.get(index);
					index++;
				}
			}
		}
		
	}
	
//---------------------------------------------------------------------
	
	public int removeAbsentStudents(int allowedAbsences)  {
		
		// to be completed in part b
		int numRemoved = 0;
		for (int r = 0; r < seats.length; r++) {
			for (int c = 0; c < seats[0].length; c++) {
				if (seats[r][c] != null &&
				seats[r][c].getAbsenceCount() > allowedAbsences) {
					seats[r][c] = null;
					numRemoved++;
				}
			}
		}
		return numRemoved;
		
	}
	
	
//-------------------------------------------------------------------
	
	public String toString()  {
		
		String str = "";
		for (int r = 0; r < seats.length; r++)  {
			for (int c = 0; c < seats[r].length; c++)  {
				if (seats[r][c] == null)
					str += "null\t";
				else 
					str += seats[r][c].getName() + seats[r][c].getAbsenceCount() + "\t";
			}
			
			str += "\n";
		} 
		
		return str;
				
			
	}
			
	

}
