package com.stackroute.PE3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks s1;

    @Before
    public void setUp() throws Exception {
        StudentMarks s1=new StudentMarks();
    }

    @Test
    public void checkGrades() {
        int[] arr={10,20,30,40};
        assertEquals(true,s1.checkGrades(arr));
    }

    @Test
    public void checkGrades1() {
        int[] arr={10,0,3,40};
        assertEquals(true,s1.checkGrades(arr));
    }
    @Test
    public void checkGrades2() {
        int[] arr={100,20,30,40};
        assertEquals(true,s1.checkGrades(arr));
    }
    @Test
    public void checkGrades3() {
        int[] arr={10,20,-30,40};
        assertEquals(false,s1.checkGrades(arr));
    }

    @Test
    public void checkGrades4() {
        int[] arr={10,20,30,400};
        assertEquals(false,s1.checkGrades(arr));
    }
}