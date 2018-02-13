package sort;

import Model.Person;
import org.junit.Test;

import java.util.Comparator;

/**
 * created by eric on 18-2-13
 */
public class InsertSortTest {

    @Test
    public void sortByDesc() {
        Person[] source = Person.list(100);
        InsertSort.sortByDesc(source, Comparator.comparingInt(Person::getAge));
        AssertUtils.isDesc(source);
    }

    @Test
    public void sortByAsc() {
        Person[] source = Person.list(100);
        InsertSort.sortByAsc(source, Comparator.comparingInt(Person::getAge));
        AssertUtils.isAsc(source);
    }
}