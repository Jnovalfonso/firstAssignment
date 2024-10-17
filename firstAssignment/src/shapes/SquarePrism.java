package shapes;

public class SquarePrism extends GeometricShape
{
	double height;
	double side;

	public SquarePrism(double height, double side) {
		super(height,side);
		
		this.height=height;
		this.side=side;
	}

	public double getCalcVolume() {
		
		return getBaseArea() * height;
	}

	public double getBaseArea() {
		
		return Math.pow(side, 2);
	}


}