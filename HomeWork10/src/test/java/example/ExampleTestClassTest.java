package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ExampleTestClassTest {
    private final ExampleTestClass example = new ExampleTestClass();

    @Test
    public void testExampleMethod1() {
        assertTrue(example.exampleMethod1());
    }

    @Test
    public void testExampleMethod2() {
        assertFalse(example.exampleMethod2());
    }

    @Test
    public void testExampleMethod3() {
        assertTrue(example.exampleMethod3());
    }

    @Test
    public void testExampleMethod4() {
        assertFalse(example.exampleMethod4());
    }

    @Test
    public void testExampleMethod5() {
        assertTrue(example.exampleMethod5());
    }
}
