package net.usepower.algorithm.sort.base;

import net.usepower.algorithm.sort.SortHelper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * created by eric on 18-2-14
 */
public class HillSortTest {

    private HillSort hillSort;

    @Before
    public void before() {
        this.hillSort = new HillSort();
    }

    @Test
    public void sortByDesc() {
        int[] source = SortHelper.getDefaultSizeArray();
        hillSort.sortByDesc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isDesc(source)));
    }

    @Test()
    public void sortByAsc() {
        int[] source = SortHelper.getDefaultSizeArray();
        hillSort.sortByAsc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isAsc(source)));
    }
}