package sort;

import java.util.Comparator;

/**
 * 希尔排序
 * created by eric on 18-2-14
 */
public class HillSort {

    public static <T> void sortByDesc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.DESC);
    }

    public static <T> void sortByAsc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.ASC);
    }

    private static <T> void sort(T[] source, Comparator<T> comparator, SortEnum sortEnum) {
        int i, j;
        // 初始化跳跃增量
        int increment = source.length;
        T temp;
        do {
            // 确认跳跃增量的值
            increment = increment / 3 + 1;
            for (i = increment + 1; i < source.length; i++) {
                boolean isAscSort = sortEnum == SortEnum.ASC && comparator.compare(source[i - increment], source[i]) > 0;
                boolean isDescSort = sortEnum == SortEnum.DESC && comparator.compare(source[i - increment], source[i]) < 0;
                if (isAscSort || isDescSort) {
                    temp = source[i];
                    // 确定各区间对应位置元素的最小值
                    for (j = i - increment; j >= 0 && ((sortEnum == SortEnum.ASC && comparator.compare(source[j], temp) > 0) || (sortEnum == SortEnum.DESC && comparator.compare(source[j], temp) < 0)); j -= increment) {
                        // 相邻区间比较并取值
                        source[j + increment] = source[j];
                    }
                    // 移动到确定的最小位置
                    source[j + increment] = temp;
                }
            }
        } while (increment > 1);
    }
}
