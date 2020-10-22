package productsimulation;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		Client c=new Client();
		c.acceptDetails();
		
		
		
	}
	void acceptDetails() {
		System.out.println("Enter Product Details");
		int proId;
		String proName;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Name");
		proName=sc.nextLine();
		System.out.println("Enter Product Id");
		proId=sc.nextInt();
		Details det=new Details(proId, proName);
		det.display();
		}

}
