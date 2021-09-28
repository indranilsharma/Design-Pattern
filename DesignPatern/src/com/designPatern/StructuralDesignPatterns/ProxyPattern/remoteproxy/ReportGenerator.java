package com.designPatern.StructuralDesignPatterns.ProxyPattern.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface ReportGenerator extends Remote {
	public String generateDailyReport() throws RemoteException;
}
