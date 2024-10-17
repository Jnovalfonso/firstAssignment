package shapes;

public class PentagonalPrism extends GeometricShape
{
double height;
double side;

public PentagonalPrism(double height, double side){

	super(height,side);
	
	this.height=height;
	this.side=side;
	
}

public double getCalcVolume() {	   
		return getBaseArea() * height;
}

public double getBaseArea() {
	return (5 * Math.pow(side, 2) * Math.tan(Math.toRadians(54))) / 4;
}
}
