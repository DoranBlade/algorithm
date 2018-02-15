package sort;

import Model.Person;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-14
 */
public class HillSortTest {

    @Test
    public void sortByDesc() {
        Person[] source = Person.list(1000);
        HillSort.sortByDesc(source, Comparator.comparingInt(Person::getAge));
        AssertUtils.isDesc(source);
    }

    @Test()
    public void sortByAsc() {
        Person[] source = Person.list(1000);
        HillSort.sortByAsc(source, Comparator.comparingInt(Person::getAge));
        AssertUtils.isAsc(source);
    }
}