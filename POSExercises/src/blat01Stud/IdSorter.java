package blat01Stud;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class IdSorter implements Sorter {

	private boolean ascending;

	public IdSorter(boolean ascending) {
		this.ascending = ascending;
	}

	public List<Student> sort(List<Student> students) {
		Comparator<Student> comparator = new IdComparator(ascending);
		Collections.sort(students, comparator );
		return students;
	}

}
