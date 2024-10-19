package utilities;

import java.util.Comparator;
import shapes.*;

public class DoubleSelection {

    public static GeometricShape[] doubleSelectionSort(GeometricShape[] shapes, Comparator<GeometricShape> compareBy) {

        Comparator<GeometricShape> comparator = compareBy;

        int arrayLength = shapes.length;

        for (int i = 0; i <= arrayLength / 2 ; i++) {
            int min = i;
            int max = i;

            for (int j = i + 1; j < arrayLength - i; j++) {
                if (comparator.compare(shapes[j], shapes[max]) > 0) {
                    max = j;
                }
                if (comparator.compare(shapes[j], shapes[min]) < 0) {
                    min = j;
                }
            }

            if (max != i) {
                GeometricShape temp = shapes[i];
                shapes[i] = shapes[max];
                shapes[max] = temp;
            }

            if (min == i) {
                min = max;
            }

            if (min != arrayLength - 1 - i) {
                GeometricShape temp = shapes[arrayLength - 1 - i];
                shapes[arrayLength - 1 - i] = shapes[min];
                shapes[min] = temp;
            }
        }

        return shapes;
    }
}