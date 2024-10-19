package utilities;

import java.util.Comparator;
import shapes.*;

public class SortManager {

    public static GeometricShape[] SortArray(GeometricShape[] shapes, char  sortedBy, char algorithm) {

        Comparator<GeometricShape> comparator;

        switch (sortedBy) {
            case 'v':
                comparator = new ComparatorVolume();
                break;
            case 'h':
                comparator = new ComparatorHeight();
                break;
            case 'a':
                comparator = new ComparatorBase();
                break;
            default:
                throw new IllegalArgumentException("Invalid sort option: " + sortedBy);
        }

        
        switch (algorithm) {
            case 'b':
            case 'B':
                // BUBBLE SORT
                System.out.println("BUBBLE SORT");
                return Bubble.bubbleSort(shapes, comparator);
            case 's':
            case 'S':
                // SELECTION SORT
                System.out.println("SELECTION SORT");
                return Selection.selectionSort(shapes, comparator);
            case 'i':
            case 'I':
                // INSERTION SORT
                System.out.println("INSERTION SORT");
                return Insertion.insertionSort(shapes, comparator);
            case 'm' :
            case 'M' :
                // MERGE SORT
                System.out.println("MERGE SORT");
                return Merge.mergeSort(shapes, comparator);
            case 'q' :
            case 'Q' :
                // QUICK SORT
                System.out.println("QUICK SORT");
                return Quick.quickSort(shapes, comparator);
            case 'z' :
            case 'Z' :
                // CUSTOM SORT: DOUBLE SELECTION SORT
                System.out.println("CUSTOM SORT: DOUBLE SELECTION SORT");
                return DoubleSelection.doubleSelectionSort(shapes, comparator);
            default:
                throw new AssertionError();
        }
    }
}
