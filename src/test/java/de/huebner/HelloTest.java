package de.huebner;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {
    private Hello testee;

    @Before
    public void beforeTest() {
        testee = new Hello();
    }

    @Test
    public void testSayHello() {
        String name = "Peter";
        String message = testee.sayHello(name);
        assertEquals("Hello " + name, message);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSayHelloWithNullArgs() {
        testee.sayHello(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSayHelloWithEmptyString() {
        testee.sayHello("");
    }
}
