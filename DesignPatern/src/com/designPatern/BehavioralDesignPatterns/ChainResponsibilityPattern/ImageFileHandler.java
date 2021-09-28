package com.designPatern.BehavioralDesignPatterns.ChainResponsibilityPattern;

public class ImageFileHandler implements Handler {

	private Handler handler;
	private String handlerName;

	public ImageFileHandler(String handlerName) {
		this.handlerName = handlerName;
	}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void process(File file) {
		if (file.getFileType().equals("video")) {
			System.out.println("Process and saving image file... by" + handlerName);
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
