package com.ntt.files;

import java.io.Serializable;

public class Student implements Serializable {
	
	transient int StudentId;
	String studentName;
 double marks;
	static int age;
	public Student(int studentId, String studentName, double marks, int age) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.age = age;
	}
	
	
	

}
