package com.intelsysdata.bankapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BankAccount {
	private String accountNo;
	private Customer owner;
    Double balance;
	
	public Double deposit(Double amount) {
		return balance += amount;
	}
	
	public abstract Double withdraw(Double amount) throws Exception ;
	
//	public Double withdraw(Double amount) throws Exception {
//		return balance -= amount;
//	}
	
	@Override
	public String toString() {
		return String.format("Account NO: %s, Customer: %s. Balanace: %5.2f",
				accountNo, owner, balance);
	}
	
	public void cetak() {
		System.out.println(this);
	}
}
