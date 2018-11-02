package net.usepower.algorithm.sort.base;

import net.usepower.algorithm.sort.SortHelper;
import net.usepower.algorithm.sort.SortTypeEnum;

/**
 * 选择排序
 * created by eric on 18-2-13
 */
class SelectSort {

    void sortByDesc(int[] source) {
        sort(source, SortTypeEnum.DESC);
    }

    void sortByAsc(int[] source) {
        sort(source, SortTypeEnum.ASC);
    }

    private void sort(int[] source, SortTypeEnum sortTypeEnum) {
        // 符合条件的索引
        int selectIndex;

        for (int i = 0; i < source.length; i++) {
            selectIndex = i;
            for (int j = i; j < source.length; j++) {
                boolean isAscSort = sortTypeEnum == SortTypeEnum.ASC && source[selectIndex] - source[j] > 0;
                boolean isDescSort = sortTypeEnum == SortTypeEnum.DESC && source[selectIndex] - source[j] < 0;
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
