package ex4;

class Cylinder extends ThreeDimensional {
	double radius = 3.0; 
	double height = 2.0;
	static final double PI = 3.14;

	@Override
	public double getSurface() {
		return 2*PI*radius*radius + 2*PI*radius*height;
	}

	@Override
	public double getVolume() {
		return PI*radius*radius*height;
	}

	@Override
	public String toString() {
		double surface=this.getSurface();
		double volume=this.getVolume();
		return "Cylinder with Radius :"+radius+" and Height :"+height+" Surface :"+ surface +" Volume :"+volume;
	}

}
