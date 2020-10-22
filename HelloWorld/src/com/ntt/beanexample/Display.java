package com.ntt.beanexample;

public class Display {
	
	
	public static void main(String[] args) {
		
		StudentBean student=new StudentBean();
		MarksBean marks=new MarksBean();
		
		
		student.setStudentId(1221);
		student.setStudentName("Shilpa");
		student.setDob("1998");

		marks.setStudentId(student.getStudentId());
		marks.setSubject1(70);
		marks.setSubject2(50);
		marks.setSubject3(80);
		marks.setSubject4(40);
		
		System.out.println("---------Student Details---------");
		System.out.println("Student Id: "+student.getStudentId()+"\n"+"Student Name: "+student.getStudentName()
		+"\n"+"Student DOB: "+student.getDob());
		
		System.out.println("Marks of: "+marks.getStudentId()+ "are");
		System.out.println("Subject1: "+marks.getSubject1()+"\n"+"Subject2: "+marks.getSubject2()+"\n"+"Subject3: "+marks.getSubject3()+"\n"
				+"Subject4: "+marks.getSubject4()+"\n");
		
		StudentDAO dao=new StudentDAOImpl();
		marks=dao.studMarks(marks);
		
		System.out.println("Total Marks Are: "+marks.getTotal());
	}

}
