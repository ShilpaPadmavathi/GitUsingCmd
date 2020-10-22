package com.ntt;

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String");
		String s1=sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'
					||s1.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Number of vowels is"+count);
		
	}

	
}
