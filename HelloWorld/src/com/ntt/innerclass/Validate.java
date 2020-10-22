package com.ntt.innerclass;

public class Validate {
	
	DebitCard dc=new DebitCard();
	
	
	class Valid{
	
	void compare(int pin, String userName) {
		
		dc.setUserName("Shilpa");
		dc.setPin(1546);
		dc.setCvv(132);
		
		//System.out.println(pin);
		
		if(pin==dc.getPin() && userName.equals(dc.getUserName())){
			
			System.out.println("Valid Data");
		}
		else {
			System.out.println("Please Enter Correct Credentials");
		}
	}
	}

}
