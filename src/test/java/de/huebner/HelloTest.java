package de.huebner;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testSayHello() {
        String name = "Peter";
        String message = new Hello().sayHello(name);
        assertEquals("Hello " + name, message);
        System.out.println(message);
    }
}
