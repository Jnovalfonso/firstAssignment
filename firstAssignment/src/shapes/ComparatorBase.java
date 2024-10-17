package shapes;
import java.util.Comparator;
public class ComparatorBase implements Comparator<GeometricShape> {
	
@Override
	
	public int compare(GeometricShape g1 , GeometricShape  g2) {
		return Double.compare(g1.getBaseArea(),g2.getBaseArea());
		

}
	
	

}
