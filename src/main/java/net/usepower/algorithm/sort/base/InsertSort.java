package net.usepower.algorithm.sort.base;

import net.usepower.algorithm.sort.SortHelper;
import net.usepower.algorithm.sort.SortTypeEnum;

/**
 * 插入排序
 * created by eric on 18-2-13
 */
public class InsertSort {

    void sortByDesc(int[] source) {
        sort(source, SortTypeEnum.DESC);
    }

    public void sortByAsc(int[] source) {
        sort(source, SortTypeEnum.ASC);
    }

    void sort(int[] source, SortTypeEnum sortTypeEnum) {
        int currentIndex;
        for (int i = 1; i < source.length; i++) {
            currentIndex = i;
            while (currentIndex > 0 && check(source[currentIndex - 1], source[currentIndex], sortTypeEnum)) {
                SortHelper.swap(source, currentIndex - 1, currentIndex);
                currentIndex--;
            }
        }
    }

    /**
     * 检查是否需要转换
     *
     * @param t1         第一个元素
     * @param t2         第二个元素
     * @param sortTypeEnum   排序方式
     * @return 检查结果
     */
    private boolean check(int t1, int t2, SortTypeEnum sortTypeEnum) {
        return (sortTypeEnum == SortTypeEnum.ASC && t1 - t2 > 0) ||
                (sortTypeEnum == SortTypeEnum.DESC && t1 - t2 < 0);
    }
}
