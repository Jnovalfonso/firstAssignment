package shapes;

public class TriangularPrism extends GeometricShape
{
	double height;
	double side;	
	
	public TriangularPrism(double height, double side) {
		super(height,side);
		this.height=height;
		this.side=side;
		
	}
	
	public double getCalcVolume() {
		 return getBaseArea() * height;	
	}
	
	public double getBaseArea() {
		return (Math.sqrt(3) * Math.pow(side, 2) / 4) ;
	}
}
