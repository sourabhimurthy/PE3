package com.stackroute.PE3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastDateTest {
    LastDate l1;

    @Before
    public void setUp() throws Exception {
       LastDate l1=new LastDate();
    }

    @Test
    public void calendarClass1() {
        String date="Mon 24/12/2018"+" "+"Sun 30/12/2018";
        assertEquals(date,l1.calendarClass());
       // assertEquals("Mon 24/12/2019"+ " "+"Sun 30/12/2018",l1.calendarClass() );
    }
}