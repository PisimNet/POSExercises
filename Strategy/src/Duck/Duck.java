package Duck;

public abstract class Duck {
	/* select our stretagy. Delegation. */
	FlyBehavior flybehavior;


	public void PerformFly() {
		flybehavior.fly();
	}
	
}
