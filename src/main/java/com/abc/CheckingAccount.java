package com.abc;

public class CheckingAccount extends Account {

	public CheckingAccount() {
		super("Checking Account");
		
	}
	
	public double interestEarned() {
		double amount = sumTransactions();
		return amount * 0.001;		
	}
	
	public String getAccountType() {
        return name;
    }

}
