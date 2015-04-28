package blatt01;

import java.util.Comparator;

public class NamberComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

	   int rollno1 = s1.getRollno();
	   int rollno2 = s2.getRollno();

	   /*For ascending order*/
	   return rollno1-rollno2;
  }
}
