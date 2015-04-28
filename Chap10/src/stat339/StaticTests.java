package stat339;

public class StaticTests extends StaticSuper {
	static int rand;
	
	static{
		rand = (int) (Math.random()*6);
		System.out.println("Stat block " + rand);
	}
	
	StaticTests(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("inside of the main");
		StaticTests st = new StaticTests();
	}
}
