package shapes;

public class Cone extends GeometricShape
{
	
	double height;
	double radius;
	
	public Cone (double height,double radius) {
		
		super(height,radius);
		this.height=height;
		this.radius=radius;
		
	}
	
	public double getCalcVolume() {
		  return (1/3) * getBaseArea() * height;

	}
	
	public double getBaseArea() {
		return  Math.PI * Math.pow(radius, 2);
	}

	
}