package sort;

import Model.Person;
import org.junit.Test;

import java.util.Comparator;

/**
 * created by eric on 18-2-13
 */
public class BubbleSortTest {

    @Test
    public void sort() {
        Person[] source = Person.list(1000);
        BubbleSort.sortByAsc(source, Comparator.comparingInt(Person::getAge));
        AssertUtils.isAsc(source);
        BubbleSort.sortByDesc(source, Comparator.comparingInt(Person::getAge));
        AssertUtils.isDesc(source);
    }

}