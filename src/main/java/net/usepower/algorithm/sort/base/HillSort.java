package net.usepower.algorithm.sort.base;

import net.usepower.algorithm.sort.SortTypeEnum;

/**
 * 希尔排序
 * created by eric on 18-2-14
 */
class HillSort {

    void sortByDesc(int[] source) {
        sort(source, SortTypeEnum.DESC);
    }

    void sortByAsc(int[] source) {
        sort(source, SortTypeEnum.ASC);
    }

    private void sort(int[] source, SortTypeEnum sortTypeEnum) {
        int i, j;
        // 初始化跳跃增量
        int increment = source.length;
        int temp;
        do {
            // 确认跳跃增量的值
            increment = increment / 3 + 1;
            for (i = increment + 1; i < source.length; i++) {
                boolean isAscSort = sortTypeEnum == SortTypeEnum.ASC && source[i - increment] - source[i] > 0;
                boolean isDescSort = sortTypeEnum == SortTypeEnum.DESC && source[i - increment] - source[i] < 0;
                if (isAscSort || isDescSort) {
                    temp = source[i];
                    // 确定各区间对应位置元素的最小值
                    for (j = i - increment; j >= 0 && ((sortTypeEnum == SortTypeEnum.ASC && source[j] - temp > 0) || (sortTypeEnum == SortTypeEnum.DESC && source[j] - temp < 0)); j -= increment) {
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
