package net.usepower.algorithm.sort.merge;

import net.usepower.algorithm.sort.SortTypeEnum;

public class MergeSort {

    void sortByAsc(int[] source) {
        sort(source, SortTypeEnum.ASC);
    }

    void sortByDesc(int[] source) {
        sort(source, SortTypeEnum.DESC);
    }

    private void sort(int[] source, SortTypeEnum sortTypeEnum) {
        int low = 0, mid = (source.length - 1) / 2, height = source.length - 1;
    }
}
