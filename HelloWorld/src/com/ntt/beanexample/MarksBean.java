package com.ntt.beanexample;

public class MarksBean {
	
	StudentBean student=new StudentBean();
	
	private int studentId=student.getStudentId();
	
	private float subject1;
	private float subject2;
	private float subject3;
	private float subject4;
	private float total;
	/*public MarksBean(int studentId, float subject1, float subject2, float subject3, float subject4, float total) {
		super();
		this.studentId = studentId;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.total = total;
	}*/
	public StudentBean getStudent() {
		return student;
	}
	public void setStudent(StudentBean student) {
		this.student = student;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public float getSubject1() {
		return subject1;
	}
	public void setSubject1(float subject1) {
		this.subject1 = subject1;
	}
	public float getSubject2() {
		return subject2;
	}
	public void setSubject2(float subject2) {
		this.subject2 = subject2;
	}
	public float getSubject3() {
		return subject3;
	}
	public void setSubject3(float subject3) {
		this.subject3 = subject3;
	}
	public float getSubject4() {
		return subject4;
	}
	public void setSubject4(float subject4) {
		this.subject4 = subject4;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	
	
	
	

}
