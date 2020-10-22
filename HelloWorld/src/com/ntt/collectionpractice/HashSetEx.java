package com.ntt.collectionpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetEx {
	public static void main(String[] args){
		
		HashSet<Employee> hs=new HashSet<Employee>();
		hs.add(new Employee(1221, "Shilpa", 55000));
		hs.add(new Employee(1204,"Soumya",25000));
		hs.add(new Employee(1203,"Appu",65000));
		
		  
		List<Employee> list = new ArrayList<Employee>(hs);
		   
		Collections.sort(list);
		   
		   for(Employee e :list) {
			   System.out.println(e);
			  // System.out.println(e.getEmployeeId());
			   //System.out.println(e.getSal());
		   }
		   System.out.println("-----------------------");
		   Collections.sort(list,new Employee());
		for(Employee e: list) {
			System.out.println(e);
		}
	}

	

}
