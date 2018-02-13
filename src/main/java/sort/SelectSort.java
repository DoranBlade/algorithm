package sort;

import java.util.Comparator;

/**
 * 选择排序
 * created by eric on 18-2-13
 */
public class SelectSort {

    public static <T> void sortByDesc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.DESC);
    }

    public static <T> void sortByAsc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.ASC);
    }

    private static <T> void sort(T[] source, Comparator<T> comparator, SortEnum sortEnum) {
        // 符合条件的索引
        int selectIndex;

        for (int i = 0; i < source.length; i++) {
            selectIndex = i;
            for (int j = i; j < source.length; j++) {
                boolean isAscSort = sortEnum == SortEnum.ASC && comparator.compare(source[selectIndex], source[j]) > 0;
                boolean isDescSort = sortEnum == SortEnum.DESC && comparator.compare(source[selectIndex], source[j]) < 0;
                if (isAscSort || isDescSort) {
                    selectIndex = j;
                }
            }
            if (i != selectIndex) {
                SortHelper.swap(source, selectIndex, i);
            }
        }
    }
}
