package com.example.assertions;
import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {
    @Test
    public void testAllAssertions() {
        assertEquals(4, 2 * 2);
        assertNotEquals(5, 2 * 2);
        assertTrue("Positive check", 3 > 0);
        assertFalse("Negative check", 3 < 0);

        String s = null;
        assertNull(s);

        s = "JUnit";
        assertNotNull(s);

        String a = "test";
        String b = a;
        String c = new String("test");

        assertSame(a, b);
        assertNotSame(a, c);

        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }

}
