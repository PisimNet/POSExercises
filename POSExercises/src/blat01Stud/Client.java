package blat01Stud;
import java.util.ArrayList;
import java.util.List;


public class Client {

	public static void main(String[] args) {
		
		Student student1 = new Student("Joe", 42);
		Student student2 = new Student("Susi", 1);
		Student student3 = new Student("FATTY", -42000);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		Sorter sorter = new NoSorter();
		List<Student> studentsSorted = sorter.sort(students);
		System.out.println(studentsSorted);
		
		Sorter nameSorter = new NameSorter();
		studentsSorted = nameSorter.sort(students);
		System.out.println(studentsSorted);
		
		Sorter idSorter = new IdSorter(false);
		studentsSorted = idSorter.sort(students);
		System.out.println(studentsSorted);
	}

}
