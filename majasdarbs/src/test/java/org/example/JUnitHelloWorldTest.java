package org.example;

import static org.junit.Assert.assertTrue;
import org.junit.*;

public class JUnitHelloWorldTest {

    @Test
    public void isGreaterTest() {
        System.out.println("Test");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        assertTrue("Num 1 is greater than Num 2", helloWorld.isGreater(4, 3));
    }

}
