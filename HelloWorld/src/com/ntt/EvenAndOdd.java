package com.ntt;

public class EvenAndOdd {
	public static void main(String[] args) {
		int i = 0;
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.println("Even: " + i);
			} else {
				System.out.println("odd: " + i);
			}
			i++;
		}
	}
}
