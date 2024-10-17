package shapes;

public class Pyramid extends GeometricShape
{
	double height;
	double side;

	public Pyramid(double height, double side) {
		super(height,side);
		
		
		this.height=height;
		this.side=side;
		
	}

	public double getCalcVolume() {
		return (1/3) * getBaseArea() * height;
	}

	public double getBaseArea() {
		return Math.pow(side, 2); 
	}
}
