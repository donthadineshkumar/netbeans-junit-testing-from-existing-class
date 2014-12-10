/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.test.Student;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dinesh
 */
public class StudentTest {
    
    Student student1;
    Student student2;
    
    public StudentTest() {
    }

    @Before
    public void setUp() {
        student1 = new Student(100, "Dinesh","JAVA");
        student2 = new Student(100, "Dinesh","C++");
    }


    @Test
    public void testCourse1(){
        String expResult = "JAVA";
        String result = student1.getCourse();
        assertEquals(expResult,result);
    }

    
    
    @Test
    public void testInitCaps(){
        String expResult = "Dinesh";
        String str = "DINESH";
        String result = student2.getInitCap(str);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testGetUpper(){
        String expResult =  "DINESH";
        String result  = student2.getUpper("dinesh");
        assertEquals(expResult, result);
    }
}
