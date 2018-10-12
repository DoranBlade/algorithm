package net.usepower.algorithm.sort.base;

import net.usepower.algorithm.sort.SortHelper;
import net.usepower.algorithm.sort.SortTypeEnum;

/**
 * 冒泡排序
 * created by eric on 18-2-13
 */
class BubbleSort {

    void sortByAsc(int[] source) {
        sort(source, SortTypeEnum.ASC);
    }

    void sortByDesc(int[] source) {
        sort(source, SortTypeEnum.DESC);
    }

    private void sort(int[] source, SortTypeEnum sortTypeEnum) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source.length - i - 1; j++) {
                // 升序时,是否需要调整元素
                boolean isAscSortSwap = sortTypeEnum == SortTypeEnum.ASC && source[j] - source[j + 1] > 0;
                // 倒序时,是否需要调整元素
                boolean isDescSortSwap = sortTypeEnum == SortTypeEnum.DESC && source[j] - source[j + 1] < 0;
                if (isAscSortSwap || isDescSortSwap) {
                    SortHelper.swap(source, j, j + 1);
                }
            }
        }
    }
}
