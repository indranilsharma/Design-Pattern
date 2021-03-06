package com.designPatern.BehavioralDesignPatterns.Command;

public class LoggingJob implements Job {

	private Logging logging;

	public void setLogging(Logging logging) {
		this.logging = logging;
	}

	@Override
	public void run() {
		System.out.println("Job ID: " + Thread.currentThread().getId() + " executing logging jobs.");
		if (logging != null) {
			logging.log();
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}
}
