package sort;

import Model.Person;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-13
 */
public class SelectSortTest {

    @Test
    public void sortByDesc() {
        Person[] source = Person.list(100);
        SelectSort.sortByAsc(source, Comparator.comparingInt(Person::getAge));
        AssertUtils.isAsc(source);
    }

    @Test
    public void sortByAsc() {
        Person[] source = Person.list(100);
        SelectSort.sortByDesc(source, Comparator.comparingInt(Person::getAge));
        AssertUtils.isDesc(source);
    }
}