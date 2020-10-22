package com.ntt.collectionpractice;

public class Book implements Comparable<Book>{
	String bookName;
	String author;
	float price;
	public Book(String bookName, String author, float price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [ bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book b) {
		if(price>b.price)
		return 1;
		else if(price<b.price)
			return -1;
		else
			return 0;
	}
	
	

}
