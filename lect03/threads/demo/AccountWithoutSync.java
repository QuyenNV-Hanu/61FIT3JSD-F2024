package lect03.threads.demo;

import java.util.concurrent.*;

public class AccountWithoutSync {
	public static Account account = new Account();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();

		// Create and launch 100 threads
		for (int i = 0; i < 100; i++) {
			executor.execute(new AddAPennyTask());
		}

		executor.shutdown();

		// Wait until all tasks are finished
		while (!executor.isTerminated()) {
		}

		System.out.println("What is balance? " + account.getBalance());
	}

	// A thread for adding a penny to the account
	public static class AddAPennyTask implements Runnable {
		public void run() {
			account.deposit(1);
		}
	}

	// An inner class for account
	public static class Account {
		public int balance = 0;

		public int getBalance() {
			return balance;
		}

		public void deposit(int amount) {
			int newBalance = balance + amount;

			// This delay is deliberately added to magnify the
			// data-corruption problem and make it easy to see.
			try {
				Thread.sleep(5);
			} catch (InterruptedException ex) {
			}

			balance = newBalance;
		}
	}
}
