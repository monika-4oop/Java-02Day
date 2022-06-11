package com.accounts;

public class Accounts {

	private int balance = 0;

	public void credit(int amount) {

		if (amount >= 0) {
			this.balance += amount;
		} else {
			System.out.println("Please enter your  input");
		}

	}



	public void debit(int amount) {
		if (amount >= 0) {
			this.balance -= amount;
		} else {
			System.out.println("Please enter valid input");
		}
	}

	public int getBalance() {
		return this.balance;
	}

}
