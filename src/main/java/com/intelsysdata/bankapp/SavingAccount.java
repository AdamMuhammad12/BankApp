package com.intelsysdata.bankapp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SavingAccount extends BankAccount {
	
	public SavingAccount(String accountNo, Customer owner, Double amount) {
		super(accountNo, owner, amount);
	}
	
	public Double withdraw(Double amount) throws Exception {
		if (balance < amount)
			throw new Exception();
		return balance -= amount;
	}
}
