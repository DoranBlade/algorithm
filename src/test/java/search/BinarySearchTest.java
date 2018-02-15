package search;

import Model.Person;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import sort.InsertSort;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-14
 */
public class BinarySearchTest {

    @Test
    public void search() {
        Comparator<Person> comparator = Comparator.comparingInt(Person::getAge);
        Person[] source = Person.list(100);
        InsertSort.sortByAsc(source, comparator);
        int index = BinarySearch.search(source, source[71], comparator);
        assertThat(index, CoreMatchers.is(71));
    }
}