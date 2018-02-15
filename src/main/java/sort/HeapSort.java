package sort;

import java.util.Comparator;

/**
 * 堆排序
 * created by eric on 18-2-14
 */
public class HeapSort {

    public static <T> void sortByDesc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.DESC);
    }

    public static <T> void sortByAsc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.ASC);
    }

    private static <T> void sort(T[] source, Comparator<T> comparator, SortEnum sortEnum) {

    }
}
