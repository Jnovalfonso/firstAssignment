package utilities;

import java.util.Comparator;
import shapes.*;

public class Merge {

    public static GeometricShape[] mergeSort(GeometricShape[] shapes, Comparator<GeometricShape> comparator) {
        if (shapes.length <= 1) {
            return shapes;
        }

        int mid = shapes.length / 2;
        GeometricShape[] left = new GeometricShape[mid];
        GeometricShape[] right = new GeometricShape[shapes.length - mid];

        System.arraycopy(shapes, 0, left, 0, mid);
        System.arraycopy(shapes, mid, right, 0, shapes.length - mid);

        left = mergeSort(left, comparator);
        right = mergeSort(right, comparator);

        return merge(left, right, comparator);
    }

    public static GeometricShape[] merge(GeometricShape[] left, GeometricShape[] right, Comparator<GeometricShape> comparator) {
        GeometricShape[] merged = new GeometricShape[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (comparator.compare(left[leftIndex], right[rightIndex]) >= 0) {
                merged[mergedIndex++] = left[leftIndex++];
            } else {
                merged[mergedIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            merged[mergedIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            merged[mergedIndex++] = right[rightIndex++];
        }

        return merged;
    }
}
