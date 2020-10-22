package com.ntt.collectionpractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
	
	public static void main(String[] args) {
		
		Deque<Patient> pa=new ArrayDeque<Patient>();
		pa.add(new Patient("Rita", "Radhika", 800.00));
		pa.add(new Patient("Geetha", "Sheena", 1000.00));
		pa.add(new Patient("jyothika", "manya", 700.00));
		
		pa.offerFirst(new Patient("Raina", "Anant", 2000.00));
		
		System.out.println("Polled Last Element"+pa.pollLast());
		
		for(Patient p: pa) {
		System.out.println(p);
		}
	}

}
