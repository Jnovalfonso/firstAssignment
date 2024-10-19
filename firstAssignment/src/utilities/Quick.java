package utilities;

import java.util.Comparator;
import shapes.GeometricShape;

public class Quick {
    public static GeometricShape[] quickSort(GeometricShape[] shapes, Comparator<GeometricShape> compareBy)
    {
        quick(shapes, 0, shapes.length - 1, compareBy);
        return shapes;
    }

    private static void quick (GeometricShape[] shapes, int low, int high, Comparator<GeometricShape> compareBy) 
    {
        if (low < high) 
        {
            int pivotIndex = partition(shapes, low, high, compareBy);
            quick(shapes, low, pivotIndex-1, compareBy);
            quick(shapes, pivotIndex + 1, high, compareBy);
        }
    }

    private static int partition (GeometricShape[] shapes, int low, int high, Comparator<GeometricShape> compareBy) 
    {
        GeometricShape pivot = shapes[high];
        int i = low - 1;

        for (int j = low; j < high; j++)
        {
            if (compareBy.compare(shapes[j], pivot) > 0) {
                i++;
                GeometricShape temp = shapes[i];
                shapes[i] = shapes[j];
                shapes[j] = temp;
            } 
        }
        GeometricShape temp = shapes[i + 1];
        shapes[i + 1] = shapes[high];
        shapes[high] = temp;

        return i + 1;
    }
}
