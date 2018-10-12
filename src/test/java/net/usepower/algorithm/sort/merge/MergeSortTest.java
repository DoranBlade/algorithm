package net.usepower.algorithm.sort.merge;

import net.usepower.algorithm.sort.SortHelper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

    private MergeSort mergeSort;

    @Before
    public void before() {
        mergeSort = new MergeSort();
    }

    @Test
    public void sortByAsc() {
        int[] source = SortHelper.getDefaultSizeArray();
        mergeSort.sortByAsc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isAsc(source)));
    }

    @Test
    public void sortByDesc() {
        int[] source = SortHelper.getDefaultSizeArray();
        mergeSort.sortByDesc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isDesc(source)));
    }
}