package com.fral.extreme.fibonacci;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class FibonacciSeriesTest {

    @Before
    public void before() {

    }

    @Test
    public void printFibonacciSeries() {

        int f4 = FibonacciSeries.fibonacci(4);
        assertEquals(3, f4);
    }
}
