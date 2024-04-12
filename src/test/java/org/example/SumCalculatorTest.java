package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest{

    SumCalculator calculator;
    @BeforeEach
    void beforeEach() {
        calculator = new SumCalculator();
    }


    @Test
    void testThatSumThreeWorks() {

        int actual = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumOneWorks() {

        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumZeroThrowsIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });
    }
}
