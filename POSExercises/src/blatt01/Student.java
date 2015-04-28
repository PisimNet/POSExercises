package blatt01;

class Student {
	
	Integer matriculationNumber; 
	String name;
	
	public Student(Integer number, String name) {
		matriculationNumber = number;
		this.name = name;
	}
	public String getStudentname() {
        return name;
   }
   public void setStudentname(String name) {
	this.name = name;
   }
   public int getRollno() {
	return matriculationNumber;
   }
   public void setRollno(int number) {
	this.matriculationNumber = number;
	} 
   }
