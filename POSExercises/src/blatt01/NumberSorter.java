package blatt01;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class NumberSorter implements Sorter {

	public List<Student> sort(List<Student> list) {
		   Comparator<Student> StuRollno = new NamberComparator();
		   Collections.sort(list, StuRollno);
		   System.out.println("Matriculation Number Sorting:");
		   for(Student student: list){
				System.out.println(" "+student.matriculationNumber+" "+student.name);
			}
		return list;
    }
	}
