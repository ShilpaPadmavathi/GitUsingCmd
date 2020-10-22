package com.ntt.bank;

import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
	
		String bankName;
		int bankCode;
		String bankType;
		int interestRate;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank Type");
		bankType=sc.next();
		System.out.println("Enter Bank Name");
		bankName=sc.next();
		System.out.println("Enter Bank Code");
		bankCode=sc.nextInt();
		System.out.println("Enter Interest Rate");
		interestRate=sc.nextInt();
		
		Bank b=new Bank(bankName, bankCode, interestRate, bankType);
		
		//String bankName, int bankCode, int interestRate, String bankType
		if(bankType.equalsIgnoreCase("public")) {
		PublicBank  pb=new PublicBank(bankName, bankCode, interestRate, bankType);
		double lir=pb.loanInterestRate(pb);
		b.displayBankDetails(b,lir);
		}
		else {
			PrivateBank  prb=new PrivateBank(bankName, bankCode, interestRate, bankType);
			double lir=prb.loanInterestRate(prb);
			b.displayBankDetails(b,lir);
		}
		/*pb.setBankName(bankName);
		pb.setBankCode(bankCode);
		pb.setBankType(bankType);
		pb.setInterestRate(interestRate);*/
		
		
	}

}
