package ex4;

class Cuboid extends ThreeDimensional {

	double length=3.0;
	double width=4.0;
	double height=5.0;

	@Override
	double getSurface() {
		return 2*(length*width+length*height+width*height);
	}

	@Override
	double getVolume() {
		return height*length*width;
	}

	@Override
	public String toString() {
		double surface=this.getSurface();
		double volume=this.getVolume();
		return "Cuboid with Length :"+length+" Width :"+ width+" and Height :"+ height+" Surface :" + surface+" Volume :"+volume;
	}
}
