package com.ntt.collectionpractice;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
			
		LinkedList<Student> ll=new LinkedList<Student>();
		ll.add(new Student(1221, "Shilpa", 85.00f));
		ll.add(new Student(1238, "Soumya", 73.08f));
		ll.add(new Student(1203, "Appu", 65.60f));
		
		Collections.sort(ll);	
		
		 for(Student s:ll) {
			 System.out.println(s);
		 }
	}

}
