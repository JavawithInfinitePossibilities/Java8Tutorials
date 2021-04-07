/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class Account {
	private int accountBalence = 10000;

	public final int getAccountBalence() {
		return accountBalence;
	}

	public final void setAccountBalence(int accountBalence) {
		this.accountBalence = accountBalence;
	}

	private void deposite(int amount) {
		accountBalence += amount;
	}

	private void withdraw(int amount) {
		accountBalence -= amount;
	}

	public static void transfer(Account acc1, Account acc2, int amount) {
		acc1.deposite(amount);
		acc2.withdraw(amount);
	}

}
