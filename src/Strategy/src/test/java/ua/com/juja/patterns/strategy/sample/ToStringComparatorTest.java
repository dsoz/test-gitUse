package ua.com.juja.patterns.strategy.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oleksandr.baglai on 02.09.2015.
 */
public class ToStringComparatorTest {

    private Comparator comparator = new ToStringLengthComparator();

    @Test
    public void testAlphabet() {
        assertEquals(false, comparator.compare("q", "a"));
        assertEquals(false, comparator.compare("a", "q"));

        assertEquals(false, comparator.compare("2", "1"));
        assertEquals(false, comparator.compare("1", "2"));

        assertEquals(false, comparator.compare("a", "1"));
        assertEquals(false, comparator.compare("1", "a"));
    }

    @Test
    public void testOnlyFirstLetter() {
        assertEquals(false, comparator.compare("q", "q"));
        assertEquals(false, comparator.compare("q", "qq"));
        assertEquals(true, comparator.compare("qq", "q"));
        assertEquals(true, comparator.compare("qqq", "qq"));
        assertEquals(false, comparator.compare("qqq", "qwe"));
    }
}
