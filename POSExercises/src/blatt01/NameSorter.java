package blatt01;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class NameSorter implements Sorter {

		public List<Student> sort(List<Student> list) {
			Comparator<Student> StuNameComparator = new NameComparator();
			 /*Sorting based on Student Name*/
			  Collections.sort(list,StuNameComparator);
			   System.out.println("Student Name Sorting:");
			   
				 for(Student student: list){
					System.out.println(" "+student.matriculationNumber+" "+student.name);
				}
			return list;
		}
}
