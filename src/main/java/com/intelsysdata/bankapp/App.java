package com.intelsysdata.bankapp;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Bank App");
		
//		BankAccount act1 = new BankAccount("1", "Fulan", 200000.0);
//		System.out.println(act1);
//		System.out.println(act1.deposit(300000.0));
//		System.out.println(act1.withdraw(150000.0));
		
//		SavingAccount act1 = new SavingAccount("1", new Customer("1", "Fulan", "Bali"), 200000.0);
//		
//		CheckingAccount act2 = new CheckingAccount("2", new Customer("2", "Udin", "Jakarta"), 100000.0);
//		
//		System.out.println(act1);
//		System.out.println(act2);
//		System.out.println(act1.withdraw(150000.0));
		
		
		
//		ArrayList<BankAccount> nasabah = new ArrayList<BankAccount>();
//		
//		nasabah.add(new SavingAccount( "1", new Customer("1", "Fulan", "Bali"), 200000.0 ));
//		nasabah.add(new CheckingAccount("2", new Customer("2", "Udin", "Jakarta"), 100000.0));
//		
//		for (BankAccount n : nasabah) {
//			n.withdraw(10000.0);
//			n.cetak();
//		}
		
//		System.out.println(nasabah.get(1).withdraw(400000.0));
		
		ISOConverter converter = new ISOConverter(
				new Iso8583MTI0100(),
				new Iso20022() {
				},
				new Rules() {

					@Override
					public Boolean convert() {
						// TODO Auto-generated method stub
						return null;
					}
					
				});
		converter.convert8583to20022();
	}

}
