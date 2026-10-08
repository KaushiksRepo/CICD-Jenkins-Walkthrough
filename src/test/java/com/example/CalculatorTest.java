package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void shouldAddNumbers() {
        Assert.assertEquals(calculator.add(2, 3), 10);
    }

    @Test
    public void shouldMultiplyNumbers() {
        Assert.assertEquals(calculator.multiply(4, 5), 20);
    }
}
