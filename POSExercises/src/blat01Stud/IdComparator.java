package blat01Stud;
import java.util.Comparator;


public class IdComparator implements Comparator<Student> {

	private boolean ascending;

	public IdComparator(boolean ascending) {
		this.ascending = ascending;
	}

	public int compare(Student o1, Student o2) {
		int id1 = o1.getId();
		int id2 = o2.getId();
		if(!ascending)
			return id2 - id1;
		else
			return id1 - id2;
	}

}
