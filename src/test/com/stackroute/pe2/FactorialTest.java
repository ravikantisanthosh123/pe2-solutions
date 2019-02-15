package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.*;

public class FactorialTest {
  Factorial fact;
    @Before
    public void setUp() throws Exception {
        fact=new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        fact=null;;
    }

    @Test
    public void factorialOfNumber1() {
        int expected=1;
        int actual=fact.factorialOfNumberTill12(1);
        assertEquals(expected,actual);
    }
    @Test
    public void factorialOfNumber12() {
        int expected=479001600;
        int actual=fact.factorialOfNumberTill12(12);
        assertEquals(expected,actual);
    }

}
