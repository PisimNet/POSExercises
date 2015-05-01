package blat01Stud;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class NameSorter implements Sorter {

	private Comparator<? super Student> comparator;

	public List<Student> sort(List<Student> students) {
		Comparator<Student> comparator = new NameComparator();
		Collections.sort(students, comparator );
		return students;
	}

}
