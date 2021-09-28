package com.designPatern.BehavioralDesignPatterns.ChainResponsibilityPattern;

public class VideoFileHandler implements Handler {

	private Handler handler;
	private String handlerName;

	public VideoFileHandler(String handlerName) {
		this.handlerName = handlerName;
	}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void process(File file) {
		if (file.getFileType().equals("image")) {
			System.out.println("Process and saving video file... by" + handlerName);
		} else if (handler != null) {
			System.out.println(handlerName + " forword request to  " + handler.getHandlerName());
			handler.process(file);
		} else {
			System.out.println("Not supproterd");
		}
	}

	@Override
	public String getHandlerName() {
		return handlerName;
	}

}
