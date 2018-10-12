package net.usepower.algorithm.sort.base;

import net.usepower.algorithm.sort.SortHelper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * created by eric on 18-2-13
 */
public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @Before
    public void before() {
        this.bubbleSort = new BubbleSort();
    }

    @Test
    public void sortByAsc() {
        int[] source = SortHelper.getDefaultSizeArray();
        bubbleSort.sortByAsc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isAsc(source)));
    }

    @Test
    public void sortByDesc() {
        int[] source = SortHelper.getDefaultSizeArray();
        bubbleSort.sortByDesc(source);
        Assert.assertThat(true, CoreMatchers.equalTo(SortHelper.isDesc(source)));
    }

}