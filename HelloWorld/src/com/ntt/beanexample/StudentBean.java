package com.ntt.beanexample;

public class StudentBean {
	
	private int studentId;
	private String StudentName;
	private String dob;
	
/*	public StudentBean(int studentId, String studentName, String dob) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		this.dob = dob;
	}*/

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	

}
