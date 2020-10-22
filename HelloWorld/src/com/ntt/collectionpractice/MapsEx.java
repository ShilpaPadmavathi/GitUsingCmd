package com.ntt.collectionpractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapsEx {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Book> hx=new HashMap<Integer, Book>();
		
		hx.put(1221, new Book("Sherlock", "Aurthur Conan Doyle", 250.38f));
		hx.put(387, new Book("Ikigai","Albert", 350.00f));
		hx.put(895, new Book("Harry Potter","JK Rowling",800.00f));
		
		for (Entry<Integer, Book> m : hx.entrySet()) {
			System.out.println("---------------");
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		Map<Integer,Patient> lh=new LinkedHashMap<Integer, Patient>();
		
		lh.put(1221, new Patient("Rita", "Radhika", 800.00));
		lh.put(1238, new Patient("Geetha", "Sheena", 1000.00));
		lh.put(1203, new Patient("jyothika", "manya", 700.00));
		System.out.println("\n Before Sorting");
		for (Entry<Integer, Patient> e : lh.entrySet()) {
			System.out.println("---------------");
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		Map<Integer, Patient> map = new TreeMap<Integer, Patient>(lh);
		
		System.out.println("\n After Sorting");
		for (Entry<Integer, Patient> e : map.entrySet()) {
			System.out.println("---------------");
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
	}

}
