package com.stackroute.PE3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutivenumTest {
    Consecutivenum c1;

    @Before
    public void setUp() throws Exception {
        Consecutivenum c1=new Consecutivenum();
    }

    @Test
    public void consecNum() {
        assertEquals(true,c1.consecNum("23,24,25"));
    }

    @Test
    public void consecNum1() {
        assertEquals(false,c1.consecNum("23,24,26"));
    }

    @Test
    public void consecNum2() {
        assertEquals(false,c1.consecNum("0,0,0"));
    }
}