package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void exampleTest1() {
        int a = 5;
        Assertions.assertTrue(a > 1);
    }

    @Test
    void exampleTest2() {
        Assertions.assertTrue(3 > 1);
    }

}
