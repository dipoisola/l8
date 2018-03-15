package l8.four.prob2;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		List<Student> students = new ArrayList<Student>();
		
		for(Object object : studentArray) {
			if (object instanceof Student)
				students.add((Student) object);
		}
		
		return students;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		/*implement */
		double totalGpa = 0.0;
		double size = studentList.size();
		
		for (Student student : studentList) {
			totalGpa += student.computeGpa();
		}
		
		return totalGpa / size;
	}
}
