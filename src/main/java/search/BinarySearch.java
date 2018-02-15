package search;

import java.util.Comparator;

/**
 * 二分查找
 * created by eric on 18-2-14
 */
public class BinarySearch {

    public static <T> int search(T[] source, T value, Comparator<T> comparator) {
        if (source == null || source.length == 0) {
            return -1;
        }
        int low, mid, high;
        low = 0;
        high = source.length;
        while (low <= high) {
            mid = (low + high) / 2;
            if (comparator.compare(source[mid], value) > 0) {
                high = mid - 1;
            } else if (comparator.compare(source[mid], value) < 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
