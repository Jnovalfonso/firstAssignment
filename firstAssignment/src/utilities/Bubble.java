package utilities;
 
import java.util.Comparator;
import shapes.*;
 
public class Bubble {
    public static GeometricShape[] bubbleSort(GeometricShape[] shapes, Comparator<GeometricShape> compareBy) {
        Comparator<GeometricShape> comparator = compareBy;
        int arrayLength = shapes.length;
        boolean swapped;
        for (int i = 0; i < arrayLength - 1; i++) {
            swapped = false;
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                // Change the comparison to sort from largest to smallest
                if (comparator.compare(shapes[j], shapes[j + 1]) < 0) {
                    GeometricShape temp = shapes[j];
                    shapes[j] = shapes[j + 1];
                    shapes[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return shapes;
    }
 }