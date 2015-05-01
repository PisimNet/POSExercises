package blatt01;

import java.util.ArrayList;
import java.util.List;

class StudRoll {
	
	List<Student> list;
	
	StudRoll (){
	
	list = new ArrayList<Student>();
    
    list.add(new Student(4565, "Tati"));
    list.add(new Student(3645, "Zoe"));
    list.add(new Student(765, "Ben"));
    list.add(new Student(5786, "Ben"));
    list.add(new Student(12, "Ugo"));
    list.add(new Student(101019, "Joda"));
    
    System.out.println("ArrayList is unsort");
	for(Student student: list){
		System.out.println(" "+student.matriculationNumber+" "+student.name);
	}
	}
	
	public void executeSotr(Sorter sorter){
		sorter.sort(list);
	}
}
	
