package com.abc;


 //This class was used to run tests while coding

public class BankDriver {

	public BankDriver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Bank bank1 = new Bank();
		Customer cust1 = new Customer("cust1");
		Customer cust2 = new Customer("cust2");
		Customer cust3 = new Customer("cust3");
		Customer cust4 = new Customer("cust4");
		
		bank1.addCustomer(cust1);
		bank1.addCustomer(cust2);
		bank1.addCustomer(cust3);
		bank1.addCustomer(cust4);
		
		System.out.println("********CUSTOMER1*********");
		//CUSTOMER1
		CheckingAccount chkgAc1 = new CheckingAccount();
		chkgAc1.deposit(10.0);
		cust1.openAccount(chkgAc1);
		System.out.println(cust1.getStatement());
		
		System.out.println("********CUSTOMER2*********");
		
		//CUSTOMER2
		SavingsAccount savAc1 = new SavingsAccount();
		savAc1.deposit(20.0);
		cust2.openAccount(savAc1);
		System.out.println(cust2.getStatement());
		
		System.out.println("*******CUSTOMER3**********");
		
		//CUSTOMER3
		MaxiSavingsAccount maxiSAcc1 = new MaxiSavingsAccount();
		maxiSAcc1.deposit(30.0);
		cust3.openAccount(maxiSAcc1);
		System.out.println(cust3.getStatement());
		
		System.out.println("*******CUSTOMER4**********");
		
		//CUSTOMER4
		CheckingAccount chkgAc2 = new CheckingAccount();
		chkgAc2.deposit(40.0);
		SavingsAccount savAc2 = new SavingsAccount();
		savAc2.deposit(50.0);
		cust4.openAccount(chkgAc2);		
		cust4.openAccount(savAc2);
		System.out.println(cust4.getStatement());
		cust4.transfer(savAc2, chkgAc2, 10.0);
		System.out.println("NEW STATEMENT" + cust4.getStatement());
		
		
		

	}

}
