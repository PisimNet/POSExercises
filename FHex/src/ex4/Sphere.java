package ex4;

class Sphere extends ThreeDimensional {
	double radius = 4.0; 
	static final double PI = 3.14;

	@Override
	public double getSurface() {
		return 4*PI*radius;
	}

	@Override
	public double getVolume() {
		return 0.75*PI*radius;
	}

	@Override
	public String toString() {
		double surface=this.getSurface();
		double volume=this.getVolume();
		return "Sphere with Radius :"+radius+" Surface :"+ surface +" Volume :"+volume;
	}

}
