package com.ntt.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User extends Bank {

	Account acc;
	String userName;
	String password;
	long mobileNum;

	public User(String bankName, String bankBranch, String ifscCode, Account acc, String userName, String password,
			long mobileNum) {
		super(bankName, bankBranch, ifscCode);
		this.acc = acc;
		this.userName = userName;
		this.password = password;
		this.mobileNum = mobileNum;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	@Override
	public String toString() {
		return "User [acc=" + acc + ", userName=" + userName + ", password=" + password + ", mobileNum=" + mobileNum
				+ "]";
	}

	public void createUser(User u1) {
		System.out.println("Account Successfully Generated");
	}
	
	public void fundTransfer(List<User> l1, long amount) throws Exception{
		
		int i=0;
		if(l1.get(i).acc.balance<amount) {
			
			throw new BalanceException("Insufficient Amount");
		}
		else {
			
		double sendUpdate=l1.get(i).acc.balance-amount;
		double recUpdate=l1.get(i+1).acc.balance+amount;
		
		l1.get(i).acc.setBalance(sendUpdate);
		l1.get(i+1).acc.setBalance(recUpdate);
		
		System.out.println("Sender Account: "+ "Branch Name: "+l1.get(i).bankBranch+
				"\n"+"Bank Name: "+l1.get(i).bankName+"\n"+"UserName: "+l1.get(i).userName+"\n"+"balance: "+l1.get(i).acc.balance+"\n"+"Account Number: "+l1.get(i).acc.accountNumber);
		
		System.out.println("-------------------------------");
		
		System.out.println("Receiver Account: "+ "Branch Name: "+l1.get(i+1).bankBranch+
				"\n"+"Bank Name: "+l1.get(i+1).bankName+"\n"+"UserName: "+l1.get(i+1).userName+"\n"+"balance: "+l1.get(i+1).acc.balance+"\n"+"Account Number: "+l1.get(i+1).acc.accountNumber);
		
		
		
		
	}
	
	}

}
