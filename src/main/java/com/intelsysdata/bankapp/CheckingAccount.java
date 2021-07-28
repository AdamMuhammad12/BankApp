package com.intelsysdata.bankapp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CheckingAccount extends BankAccount {
	public CheckingAccount(String accountNo, Customer owner, double amount) {
		// TODO Auto-generated constructor stub
		super(accountNo, owner, amount);
		
	}

	public Double withdraw(Double amount) throws Exception {
		return balance -= amount;
	}
}
