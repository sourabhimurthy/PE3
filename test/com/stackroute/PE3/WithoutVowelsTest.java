package com.stackroute.PE3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WithoutVowelsTest {
    WithoutVowels w1;

    @Before
    public void setUp() throws Exception {
        WithoutVowels w1=new WithoutVowels();
    }

    @Test
    public void removeVowels() {
        String[] s1=new String[]{"India","Money"};
        String[] s2=new String[]{"nd", "Mny"};
        assertEquals("ndMny",w1.removeVowels(s1));
    }

    @Test
    public void removeVowels1() {
        String[] s1=new String[]{"Consonant","Home"};
        String[] s2=new String[]{"Cnsnnt", "Hm"};
        assertEquals("CnsnntHm",w1.removeVowels(s1));
    }
}