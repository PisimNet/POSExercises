package headfirst.strategy;

public class HisDuck extends Duck {

	@Override
	void display() {
		System.out.println("I'm a HIS Duck");

	}
	public HisDuck() {
		flyBehavior = new FlyTheHISWay();
	}

}
