package net.usepower.algorithm.search;

/**
 * 二分查找
 * created by eric on 18-2-14
 */
class BinarySearch {

    int search(int[] source, int value) {
        if (source == null || source.length == 0) {
            return -1;
        }
        int low, mid, high;
        low = 0;
        high = source.length;
        while (low <= high) {
            mid = (low + high) / 2;
            if (source[mid] - value > 0) {
                high = mid - 1;
            } else if (source[mid] - value < 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
