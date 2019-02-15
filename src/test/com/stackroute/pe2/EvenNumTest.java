package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {

        EvenNum even;
        @Before
        public void setUp() throws Exception {
            even = new EvenNum();
        }

        @After
        public void tearDown() throws Exception {
            even = null;
        }

        @Test
        public void isEvenSuccess() {
            assertEquals(true, even.isEven(10));
            assertNotNull(even.isEven(10));
        }

        @Test
        public void isEvenFailure() {
            assertEquals(false, even.isEven(9));
            assertNotNull(even.isEven(9));
        }

        @Test
        public void isEven() {
            assertEquals(true, even.isEven(0));
            assertNotNull(even.isEven(0));
        }



}