package search;

import Model.Person;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-14
 */
public class SequenceSearchTest {

    @Test
    public void search() {
        Person[] source = Person.list(100);
        int index = SequenceSearch.search(source, source[71]);
        assertThat(index, CoreMatchers.is(71));
    }
}