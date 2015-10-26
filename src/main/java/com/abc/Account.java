package com.abc;

import java.util.ArrayList;
import java.util.List;


public abstract class Account {

	// Implemented new design - Subclassing

	protected String name;

	public List<Transaction> transactions;

	public Account(String name) {
		super();
		this.name = name;
		this.transactions = new ArrayList<Transaction>();
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("amount must be greater than zero");
		} else {
			transactions.add(new Transaction(amount));
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("amount must be greater than zero");
		} else {
			transactions.add(new Transaction(-amount));
		}
	}


	public double sumTransactions() {
		return checkIfTransactionsExist(true);
	}

	private double checkIfTransactionsExist(boolean checkAll) {
		double amount = 0.0;
		for (Transaction t : transactions)
			amount += t.amount;
		return amount;
	}
 
	/*
	 * public int getAccountType() { return accountType; }
	 * Abstract method - implemented by subclass
	 */
	public abstract String getAccountType();

	/*
	 * Abstract method - implemented by subclass
	 */
	public abstract double interestEarned();

}
