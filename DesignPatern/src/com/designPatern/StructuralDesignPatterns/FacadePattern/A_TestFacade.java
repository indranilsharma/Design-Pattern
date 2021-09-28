package com.designPatern.StructuralDesignPatterns.FacadePattern;

public class A_TestFacade {
	public static void main(String[] args) {
	
		A_ScheduleServer scheduleServer = new A_ScheduleServer();
		A_ScheduleServerFacade facadeServer = new A_ScheduleServerFacade(scheduleServer);
		facadeServer.startServer();

		System.out.println("Start working......");
		System.out.println("After work done.........");

		facadeServer.stopServer();
	}
}
