package com.ntt.collections;

public class Bank {
	
	String bankName;
	String bankBranch;
	String ifscCode;
	public Bank(String bankName, String bankBranch, String ifscCode) {
		super();
		this.bankName = bankName;
		this.bankBranch = bankBranch;
		this.ifscCode = ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankBranch=" + bankBranch + ", ifscCode=" + ifscCode + "]";
	};
	
	
	
	

}
