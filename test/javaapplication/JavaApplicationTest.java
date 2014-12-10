/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import com.cases.JavaApplication;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dinesh
 */
public class JavaApplicationTest {
    
    public JavaApplicationTest() {
    }
 
    /**
     * Test of sayHello method, of class JavaApplication.
     */
    @Test
    public void testSayHello_0args() {
        System.out.println("sayHello");
        JavaApplication instance = new JavaApplication();
        String expResult = "Hello";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sayHello method, of class JavaApplication.
     * @param name
     */
       @Test
    public void testSayHello_String() {
    System.out.println("sayHello with parameters");
    JavaApplication instance = new JavaApplication();
    String name= "Dinesh";
    String expResult = "Hello, Dinesh";
    String result = instance.sayHello(name);
    assertEquals(expResult, result);
    
    }

    /**
     * Test of calcultateTotal method, of class JavaApplication.
     * @param totalmarks
     */
      @Test
    public void testCalcultateTotal() {
    System.out.println("calcultateTotal");
    int[] marks = {10, 20, 30, 40, 50};
    JavaApplication instance = new JavaApplication();
    int expResult = 150;
    int result = instance.calcultateTotal(marks);
    assertEquals(expResult, result);
    }
    
}
