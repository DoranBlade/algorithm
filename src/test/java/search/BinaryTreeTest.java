package search;

import Model.Person;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-15
 */
public class BinaryTreeTest {

    @Test
    public void search() {
        Person[] source = Person.list(100);
        BinaryTree<Person> binaryTree = BinaryTree.instance(source);
        Person result = binaryTree.search(source[71].getAge());
        assertThat(result, CoreMatchers.sameInstance(source[71]));
    }

    @Test
    public void insert() {
        Person[] source = Person.list(6);
        BinaryTree<Person> binaryTree = BinaryTree.instance(source);
        Person insertInstance = Person.instance();
        binaryTree.insert(insertInstance);
        Person result = binaryTree.search(insertInstance.getAge());
        assertThat(result, CoreMatchers.sameInstance(insertInstance));
    }

    @Test
    public void delete() {
        Person[] source = Person.list(10);
        BinaryTree<Person> binaryTree = BinaryTree.instance(source);
        binaryTree.delete(source[5].getAge());
        Person result = binaryTree.search(source[5].getAge());
        assertThat(result, CoreMatchers.nullValue());
    }
}