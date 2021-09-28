package com.designPatern.StructuralDesignPatterns.FacadePattern;

public class A_With_Out_Facade {
	public static void main(String[] args) {
		A_ScheduleServer scheduleServer = new A_ScheduleServer();

		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();

		System.out.println("Start working......");
		System.out.println("After work done.........");

		scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
	}
}
