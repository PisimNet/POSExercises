package Vogel;

class VogelClient {

	public static void main(String[] args) {
		RedHeadDuck redDuck = new RedHeadDuck();
		redDuck.fly();
		redDuck.KryaSound();
		
		YellowTurkey yTurkey = new YellowTurkey();
		yTurkey.walk();
		yTurkey.GagaSound();
		
		Duck adapter = new TurkeyAdapter(yTurkey);
		adapter.fly();
		adapter.KryaSound();
		
		testDuck(adapter);
		testDuck(redDuck);
		
	}

	private static void testDuck(Duck duck) {
		duck.fly();
	}

}
