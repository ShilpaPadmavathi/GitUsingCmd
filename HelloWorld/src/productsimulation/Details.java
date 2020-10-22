package productsimulation;

import java.util.Scanner;

public class Details {
	
	int proId;
	String proName;
	public Details(int proId, String proName) {
		super();
		this.proId = proId;
		this.proName = proName;
	}
	
	String dec=null;
	
	
	void display() {
		System.out.println("Product Id is: "+proId+"\n"+"Product name is: "+proName);
		
		System.out.println("Do You Wish To Continue \n"+"Enter Yes/no");
		Scanner sc=new Scanner(System.in);
		dec=sc.next();
		
		if(dec.equalsIgnoreCase("Yes")) {
			Client c=new Client();
			c.acceptDetails();
		}
	}

}
