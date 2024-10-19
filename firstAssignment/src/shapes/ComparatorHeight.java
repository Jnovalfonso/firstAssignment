package shapes;

import java.util.Comparator;

public class ComparatorHeight implements Comparator<GeometricShape> {
	
    @Override 
    public int compare(GeometricShape g1 , GeometricShape  g2) {
        return Double.compare(g1.getHeight(), g2.getHeight());
    }
}
