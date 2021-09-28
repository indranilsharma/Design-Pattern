package com.designPatern.CreationalDesignPatterns.BuilderPattern;

public class ComputerClass_Builder_pattern {

	private String HDD;

	private String PC;

	private boolean isCameraEnable;
	private boolean isBlothoothEnable;

	public String getHDD() {
		return HDD;
	}

	public String getPC() {
		return PC;
	}

	public boolean isCameraEnable() {
		return isCameraEnable;
	}

	public boolean isBlothoothEnable() {
		return isBlothoothEnable;
	}

	private ComputerClass_Builder_pattern(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.PC = builder.PC;
		this.isCameraEnable = builder.isBlothoothEnable;
		this.isBlothoothEnable = builder.isCameraEnable;
	}

	public static class ComputerBuilder {

		private String HDD;

		private String PC;

		private boolean isCameraEnable;

		private boolean isBlothoothEnable;

		public ComputerBuilder setCameraEnable(boolean isCameraEnable) {
			this.isCameraEnable = isCameraEnable;
			return this;
		}

		public ComputerBuilder setBlothoothEnable(boolean isBlothoothEnable) {
			this.isBlothoothEnable = isBlothoothEnable;
			return this;
		}

		public ComputerBuilder(String hDD, String pC) {
			this.HDD = hDD;
			this.PC = pC;
		}

		public ComputerClass_Builder_pattern build() {
			return new ComputerClass_Builder_pattern(this);
		}

	}
}
