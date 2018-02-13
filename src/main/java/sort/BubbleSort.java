package sort;

import java.util.Comparator;

/**
 * 冒泡排序
 * created by eric on 18-2-13
 */
public class BubbleSort {

    /**
     * 生序排序
     * @param source 源数据
     * @param comparator 比较器
     * @param <T> 数据类型
     */
    public static <T> void sortByAsc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.ASC);
    }

    /**
     * 降序排序
     * @param source 源数据
     * @param comparator 比较器
     * @param <T> 数据类型
     */
    public static <T> void sortByDesc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.DESC);
    }

    /**
     * 排序
     * @param source 源数据
     * @param comparator 比较器
     * @param sortEnum 排序方式
     * @param <T> 数据类型
     */
    private static <T> void sort(T[] source, Comparator<T> comparator, SortEnum sortEnum) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source.length - i - 1; j++) {
                // 升序时,是否需要调整元素
                boolean isAscSortSwap = sortEnum == SortEnum.ASC && comparator.compare(source[j], source[j + 1]) > 0;
                // 倒序时,是否需要调整元素
                boolean isDescSortSwap = sortEnum == SortEnum.DESC && comparator.compare(source[j], source[j + 1]) < 0;
                if (isAscSortSwap || isDescSortSwap) {
                    SortHelper.swap(source, j, j + 1);
                }
            }
        }
    }
}
