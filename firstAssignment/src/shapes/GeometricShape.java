package shapes;
public abstract class GeometricShape implements Comparable <GeometricShape> {
	double height;
	double radius;
	
	
	public GeometricShape(double height, double radius) {
		
		this.height=height;
		this.radius=radius;
		
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public abstract double getCalcVolume();
	public abstract double getBaseArea();
	
	@Override
	public int compareTo(GeometricShape other) {
	    return Double.compare(this.height, other.height);
	    }

}

	


