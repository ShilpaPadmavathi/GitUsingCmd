package com.ntt.bank;

public class Bank {
	
	String bankName;
	int bankCode;
	
	int interestRate;
	String bankType;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}

	
	public Bank(String bankName, int bankCode, int interestRate, String bankType) {
		super();
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.interestRate = interestRate;
		this.bankType = bankType;
	}
	void displayBankDetails(Bank b,double loanInterestRate) {
		PublicBank pb=new PublicBank(bankName, bankCode, interestRate, bankType);
		if(pb instanceof Bank) {
			  //Fruit myFruit = (Fruit)myApple;
			

		b=(Bank)pb;
		System.out.println(" Bank Name: " +pb.getBankName()+"\n"+"Bank Code: "+pb.getBankCode());
		System.out.println("Bank Type: "+pb.getBankType()+"\n"+"Interest Rate:"+pb.getInterestRate());
		//double loan=pb.loanInterestRate();
		System.out.println("Loan: "+loanInterestRate);
		
		System.out.println("Account Details: ");
		System.out.println("Account Balance: "+pb.account.balance+"\n"+"Account Id: "+pb.account.id);
	}
	}
}
