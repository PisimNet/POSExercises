package Duck;

public class CantFly implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("i cann't fly at all :( ");

	}

}
