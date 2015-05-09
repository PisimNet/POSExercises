package Vogel;

class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey=turkey;
	}

	public void fly() {
		turkey.walk();
	}

	public void KryaSound() {
		turkey.GagaSound();
	}

}
