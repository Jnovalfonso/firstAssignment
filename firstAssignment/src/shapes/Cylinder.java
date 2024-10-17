package shapes;

public class  Cylinder extends GeometricShape
{
	double height;
	double radius;
	
	public Cylinder(double height,double radius) {
		super(height,radius);
		
		this.height=height;
		this.radius=radius;		
	}
	

	public double getCalcVolume() {
		return  getBaseArea() * height;
	}
	
	public double getBaseArea() {
		return  Math.PI * Math.pow(radius, 2);
	}

	
	
	
	

}
