package net.usepower.algorithm.search;

import net.usepower.algorithm.sort.SortHelper;
import net.usepower.algorithm.sort.base.InsertSort;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * created by eric on 18-2-14
 */
public class BinarySearchTest {

    @Test
    public void search() {
        InsertSort insertSort = new InsertSort();
        int[] source = SortHelper.getDefaultSizeArray();
        insertSort.sortByAsc(source);
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.search(source, source[71]);
        assertThat(index, CoreMatchers.is(71));
    }
}