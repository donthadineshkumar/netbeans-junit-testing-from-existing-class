/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.Locale;

public class Student {
 
    private long studentId;
    private String studentName;
    private String course;

    
    public Student(long studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getInitCap(String str){
        String  givenStr = str;
        String  init= givenStr.substring(0, 1).toUpperCase();
        String rest = givenStr.substring(1, givenStr.length()).toLowerCase();
        return  init+rest;
    }
    
    public String getUpper(String str){
        return str.toUpperCase();
    }
    
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    
}
