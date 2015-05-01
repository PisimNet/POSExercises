package blatt01;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		String StudentName1 = s1.getStudentname().toUpperCase();
		   String StudentName2 = s2.getStudentname().toUpperCase();

		   //ascending order
		   return StudentName1.compareTo(StudentName2);
	    };

	}


