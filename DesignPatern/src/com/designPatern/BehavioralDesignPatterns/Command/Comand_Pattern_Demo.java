package com.designPatern.BehavioralDesignPatterns.Command;

public class Comand_Pattern_Demo {

	public static void main(String[] args) {
		init();
	}

	public static void init() {
		ThreadPool pool = new ThreadPool(10);

		Email email = null;
		EmailJob emailJob = new EmailJob();

		Sms sms = null;
		SmsJob smsJob = new SmsJob();

		FileIO fileIO = new FileIO();
		FileIOJob fileIOJob = new FileIOJob();

		Logging logging = null;
		LoggingJob loggingJob = new LoggingJob();

		for (int i = 0; i < 5; i++) {
			email = new Email();
			emailJob.setEmail(email);

			sms = new Sms();
			smsJob.setSms(sms);

			fileIO = new FileIO();
			fileIOJob.setFileIO(fileIO);

			logging = new Logging();
			fileIOJob.setFileIO(fileIO);

			pool.addJob(emailJob);
			pool.addJob(smsJob);
			pool.addJob(fileIOJob);
			pool.addJob(loggingJob);
		}
		pool.shutdownPool();
	}
}
