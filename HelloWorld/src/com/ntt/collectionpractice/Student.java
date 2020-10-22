package com.ntt.collectionpractice;

public class Student implements Comparable<Student>{
	
	int studentId;
	String studentName;
	float marks;
	public Student(int studentId, String studentName, float marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}


	@Override
	public int compareTo(Student s) {
		if(studentId==s.studentId) {
			return 0;
		}
			else if(studentId>s.studentId) {
				return 1;
			}
			else 
				return -1;
		
	}
}