package com.jdc.akm.builder;

@SuppressWarnings("unused")
public class Computer {

	private String memory;
	private String graphic;
	private String keyboard;
	private String mouse;
	
	private ComputerBuilder builder;
	
	public Computer(ComputerBuilder builder) {
		this.memory = builder.memory;
		this.graphic = builder.graphic;
		this.keyboard = builder.keyboard;
		this.mouse = builder.mouse;
		
	}
	
	class ComputerBuilder{
		
		private String memory;
		private String graphic;
		private String keyboard;
		private String mouse;
		
		private ComputerBuilder() {}
		
		public ComputerBuilder setMemory(String memory) {
			this.memory = memory;
			return this;
		}
		
		public ComputerBuilder setGraphic(String graphic) {
			this.graphic = graphic;
			return this;
		}
		
		public ComputerBuilder setKeyboard(String keyboard) {
			this.keyboard = keyboard;
			return this;
		}
		
		public ComputerBuilder setMouse(String mouse) {
			this.mouse = mouse;
			return this;
		}
		
		public static Computer builder() {
			return new Computer(this);
		}
			
	}
	
}
