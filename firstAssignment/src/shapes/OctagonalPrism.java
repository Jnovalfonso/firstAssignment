package shapes;

public class OctagonalPrism extends GeometricShape
{
	double height;
	double side;
	double sideLength;
	
	public OctagonalPrism (double height,double side){
		super(height,side);
		this.height=height;
		this.side=side;
	
	}
	
	@Override
	public double getCalcVolume() {
		 
		return getBaseArea() * height;
	}
	
	@Override
	public double getBaseArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
	}


}
