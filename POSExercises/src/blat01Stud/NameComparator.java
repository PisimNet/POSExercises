package blat01Stud;
import java.util.Comparator;


public class NameComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();		
		return name1.compareTo(name2);
	}

}
