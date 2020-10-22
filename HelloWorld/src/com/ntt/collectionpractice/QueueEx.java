package com.ntt.collectionpractice;

import java.util.PriorityQueue;

public class QueueEx {
	
	public static void main(String[] args) {
		
		PriorityQueue<Book> b=new PriorityQueue<Book>();
		b.add(new Book("Sherlock", "Aurthur Conan Doyle", 250.38f));
		b.add(new Book("Ikigai","Albert", 350.00f));
		b.add(new Book("Harry Potter","JK Rowling",800.00f));
		
		for(Book b1:b){  
		    System.out.println(b1.bookName+" "+b1.author+" "+b1.price);  
		    }  
		
		
		System.out.println("After removing a record"+b.remove());
		for(Book b1:b){  
		    System.out.println(b1.bookName+" "+b1.author+" "+b1.price);  
		    }  
		
		System.out.println("the First record"+b.peek());
		System.out.println(b.poll());
		
		System.out.println("After Polling");
		for(Book b1:b){  
		    System.out.println(b1.bookName+" "+b1.author+" "+b1.price);  
		    }  
	}

}
