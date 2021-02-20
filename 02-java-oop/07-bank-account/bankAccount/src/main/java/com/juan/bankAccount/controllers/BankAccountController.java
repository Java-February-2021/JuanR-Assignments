package com.juan.bankAccount.controllers;

import com.juan.bankAccount.models.BankAccount;

public class BankAccountController {
	
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.depositMoney(123.45, "checking");
		ba.depositMoney(1.00, "savings");
		ba.displayBalance();

		System.out.println(BankAccount.totalMoney);

		ba.withdrawMoney(100, "checking");
		ba.withdrawMoney(20, "savings");
		ba.displayBalance();

		System.out.println(BankAccount.totalMoney);
	}
}
