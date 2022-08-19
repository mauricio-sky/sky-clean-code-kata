package uk.sky.kata.cleancode.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Example {

    @Test
    void basicMathTest() {
        assertEquals(2, 6/3);
        assertEquals(4, 2*2);
    }

    @Test
    void divisionWorks() {
        assertEquals(2, 6/3);
    }

    @Test
    void multiplicationWorks() {
        assertEquals(4, 2*2);
    }
}
