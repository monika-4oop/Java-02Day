package com.accounts;

public class AccountsRunner {

	public static void main(String[] args) {

		Accounts user = new Accounts();

		user.credit(102000);
		user.debit(2000);

		int balance = user.getBalance();
		System.out.println(balance);

	}

}
