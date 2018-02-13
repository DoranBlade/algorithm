package sort;

import java.util.Comparator;

/**
 * 插入排序
 * created by eric on 18-2-13
 */
public class InsertSort {

    public static <T> void sortByDesc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.DESC);
    }

    public static <T> void sortByAsc(T[] source, Comparator<T> comparator) {
        sort(source, comparator, SortEnum.ASC);
    }

    private static <T> void sort(T[] source, Comparator<T> comparator, SortEnum sortEnum) {
        int currentIndex;
        for (int i = 1; i < source.length; i++) {
            currentIndex = i;
            while (currentIndex > 0 && check(source[currentIndex - 1], source[currentIndex], comparator, sortEnum)) {
                SortHelper.swap(source, currentIndex - 1, currentIndex);
                currentIndex--;
            }
        }
    }

    /**
     * 检查是否需要转换
     * @param t1 第一个元素
     * @param t2 第二个元素
     * @param comparator 比较器
     * @param sortEnum 排序方式
     * @param <T> 元素类型
     * @return 检查结果
     */
    private static <T> boolean check(T t1, T t2, Comparator<T> comparator, SortEnum sortEnum) {
        return (sortEnum == SortEnum.ASC && comparator.compare(t1, t2) > 0) ||
                (sortEnum == SortEnum.DESC && comparator.compare(t1, t2) < 0);
    }
}
