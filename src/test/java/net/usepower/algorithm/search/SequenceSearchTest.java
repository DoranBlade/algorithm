package net.usepower.algorithm.search;

import net.usepower.algorithm.sort.SortHelper;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * created by eric on 18-2-14
 */
public class SequenceSearchTest {

    @Test
    public void search() {
        int[] source = SortHelper.getDefaultSizeArray();
        SequenceSearch sequenceSearch = new SequenceSearch();
        int index = sequenceSearch.search(source, source[71]);
        assertThat(index, CoreMatchers.is(71));
    }
}