package com.ntt.bank;

public interface RBI {
	
	double loanInterestRate(PublicBank pb);

	double loanInterestRate(PrivateBank prb);

	//int loanInterestRate(int interestRate);

}
