package utilities;

import java.util.Comparator;
import shapes.*;

public class Insertion {

    public static GeometricShape[] insertionSort(GeometricShape[] shapes, Comparator<GeometricShape> compareBy) {
        int arrayLength = shapes.length;
 
        for (int i = 1; i < arrayLength; i++) {
            GeometricShape key = shapes[i];
            int j;
 
            for (j = i - 1; j >= 0 && compareBy.compare(shapes[j], key) < 0; j--) {
                shapes[j + 1] = shapes[j];
            }
 
            shapes[j + 1] = key;
        }
 
        return shapes;
    }
}