package com.designPatern.BehavioralDesignPatterns.memento;

class Memento {

	public int balance;

	public Memento(int balance) {
		this.balance = balance;
	}

}

class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public Memento deposite(int amount) {
		balance = balance + amount;
//		 it will role back balance 
		return new Memento(balance);
	}

	public void restore(Memento m) {
		balance = m.balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

}

public class Memento_Demo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		System.out.println(account);
		Memento m1 = account.deposite(500);
		Memento m2 = account.deposite(250);
		System.out.println(account);

// restore to m1
		account.restore(m1);
		System.out.println(account);

//		only one state can be save 
//restore to m2
		account.restore(m2);
		System.out.println(account);
	}
}
