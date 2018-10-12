package net.usepower.algorithm.sort.base;

import net.usepower.algorithm.sort.SortHelper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * created by eric on 18-2-13
 */
public class SelectSortTest {

    private SelectSort selectSort;

    @Before
    public void before() {
        this.selectSort = new SelectSort();
    }

    @Test
    public void sortByDesc() {
        int[] source = SortHelper.getDefaultSizeArray();
        selectSort.sortByAsc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isDesc(source)));
    }

    @Test
    public void sortByAsc() {
        int[] source = SortHelper.getDefaultSizeArray();
        selectSort.sortByDesc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isAsc(source)));
    }
}