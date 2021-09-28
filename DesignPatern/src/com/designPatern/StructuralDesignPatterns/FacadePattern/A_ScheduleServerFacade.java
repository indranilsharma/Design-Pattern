package com.designPatern.StructuralDesignPatterns.FacadePattern;

public class A_ScheduleServerFacade {
	private final A_ScheduleServer scheduleServer;

	public A_ScheduleServerFacade(A_ScheduleServer scheduleServer){
	this.scheduleServer = scheduleServer;
	}

	public void startServer() {
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
	}

	public void stopServer() {
		scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
	}
}
