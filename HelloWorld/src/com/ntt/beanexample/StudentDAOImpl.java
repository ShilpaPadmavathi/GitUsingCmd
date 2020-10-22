package com.ntt.beanexample;

public class StudentDAOImpl implements StudentDAO{
	
	//MarksBean marks=new MarksBean();

	@Override
	public MarksBean studMarks(MarksBean marks) {
		
		float total=marks.getSubject1()+marks.getSubject2()+marks.getSubject3()+marks.getSubject4();
		marks.setTotal(total);
		
		
		return marks;
		
		
	}
	
	

}
