package utilities;

import java.util.Comparator;
import shapes.*;

public class Selection {

    public static GeometricShape[] selectionSort(GeometricShape[] shapes, Comparator<GeometricShape> comparator) {
        int arrayLength = shapes.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            int maxIndex = i;  

            for (int j = i + 1; j < arrayLength; j++) {
                if (comparator.compare(shapes[j], shapes[maxIndex]) > 0) {  
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                GeometricShape temp = shapes[i];
                shapes[i] = shapes[maxIndex];
                shapes[maxIndex] = temp;
            }
        }

        return shapes;
    }
}
