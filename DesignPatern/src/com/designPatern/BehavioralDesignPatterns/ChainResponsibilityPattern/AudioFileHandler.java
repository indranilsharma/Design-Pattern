package com.designPatern.BehavioralDesignPatterns.ChainResponsibilityPattern;

public class AudioFileHandler implements Handler {

	private Handler handler;
	private String handlerName;

	public AudioFileHandler(String handlerName) {
		this.handlerName = handlerName;
	}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void process(File file) {
		if (file.getFileType().equals("audio")) {
			System.out.println("Process and saving audio file... by" + handlerName);
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
