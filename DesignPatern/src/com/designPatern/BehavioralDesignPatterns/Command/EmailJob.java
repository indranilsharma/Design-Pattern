package com.designPatern.BehavioralDesignPatterns.Command;

public class EmailJob implements Job {

	private Email email;

	public void setEmail(Email email) {
		this.email = email;
	}

	@Override
	public void run() {
		System.out.println("Job ID: " + Thread.currentThread().getId() + " executing email jobs.");
		if (email != null) {
			email.sendEmail();
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}
}
