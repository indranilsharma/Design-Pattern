package com.designPatern.StructuralDesignPatterns.ProxyPattern.protectionproxy;

public interface Staff {

	public boolean isOwner();
	public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
