/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

public class JavaApplication {

    protected int totalMarks;
    
 public String sayHello(){
     return "Hello";
 }
 
public String sayHello(String name ){
     return "Hello, "+ name ;
 }
 
public int  calcultateTotal(int... marks ){
    for (int submark : marks) {
        totalMarks += submark;
    }
 return totalMarks;
}
    
}
