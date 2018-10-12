package net.usepower.algorithm.search;

import net.usepower.algorithm.sort.SortHelper;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * created by eric on 18-2-15
 */
public class BinaryTreeTest {

    @Test
    public void search() {
        int[] source = SortHelper.getDefaultSizeArray();
        BinaryTree binaryTree = BinaryTree.instance(source);
        Integer result = binaryTree.search(source[71]);
        assertThat(result, CoreMatchers.sameInstance(source[71]));
    }

    @Test
    public void insert() {
        int[] source = SortHelper.getDefaultSizeArray();
        BinaryTree binaryTree = BinaryTree.instance(source);
        binaryTree.insert(SortHelper.getRandom());
    }

    @Test
    public void delete() {
        int[] source = SortHelper.getDefaultSizeArray();
        BinaryTree binaryTree = BinaryTree.instance(source);
        binaryTree.delete(source[5]);
        Integer result = binaryTree.search(source[5]);
        assertThat(result, CoreMatchers.nullValue());
    }
}