package shapes;
import java.util.Comparator;

public class ComparatorVolume implements Comparator<GeometricShape> {
	
	@Override
	
	public int compare(GeometricShape g1 , GeometricShape  g2) {
		return Double.compare(g1.getCalcVolume(),g2.getCalcVolume());
		
		

}
	
	
}
