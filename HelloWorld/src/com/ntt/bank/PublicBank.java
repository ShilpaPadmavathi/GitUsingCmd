package com.ntt.bank;

import java.util.Scanner;

public class PublicBank extends Bank implements RBI{
	
	private String bankName;
	private int bankCode;
	
	private int interestRate;
	private String bankType;
	Account account=new Account();
	
	Bank b=new Bank(bankName, bankCode, bankCode, bankName);

	
	
	public PublicBank(String bankName, int bankCode, int interestRate, String bankType) {
		super(bankType, interestRate, interestRate, bankType);
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.interestRate = interestRate;
		this.bankType = bankType;
	}

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

public int getInterestRate() {
	return interestRate;
}

public void setInterestRate(int interestRate) {
	this.interestRate = interestRate;
}

public String getBankType() {
	return bankType;
}

public void setBankType(String bankType) {
	this.bankType = bankType;
}

	@Override
	public double loanInterestRate(PublicBank pb) {
		System.out.println(pb.getInterestRate());
		double lir=(account.balance*pb.interestRate)/100;
		
		return lir;
		
	}

	@Override
	public double loanInterestRate(PrivateBank prb) {
		// TODO Auto-generated method stub
		return 0;
	}


}
