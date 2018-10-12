package net.usepower.algorithm.sort.base;

import net.usepower.algorithm.sort.SortHelper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * created by eric on 18-2-13
 */
public class InsertSortTest {

    private InsertSort insertSort;

    @Before
    public void before() {
        this.insertSort = new InsertSort();
    }

    @Test
    public void sortByDesc() {
        int[] source = SortHelper.getDefaultSizeArray();
        insertSort.sortByDesc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isDesc(source)));
    }

    @Test
    public void sortByAsc() {
        int[] source = SortHelper.getDefaultSizeArray();
        insertSort.sortByAsc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isAsc(source)));
    }
}