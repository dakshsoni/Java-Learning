package com.builder.design.pattern;

/**
 <h1> Builder Design Pattern : </h1><span>create complex object step by step</span>
 
 @author deepak Soni
 */
public class BuilderDesignPatternComputer {
	
	
	private String ram;
	private String rom;
	private String model;
	private Boolean isWifiSupport;
	private Boolean isGraphicCardSupport;
	
	
	public BuilderDesignPatternComputer(String ram, String rom, String model, Boolean isWifiSupport,
			Boolean isGraphicCardSupport) {
		super();
		this.ram = ram;
		this.rom = rom;
		this.model = model;
		this.isWifiSupport = isWifiSupport;
		this.isGraphicCardSupport = isGraphicCardSupport;
	}
	
	public static class Builder{
		
		private String ram;
		private String rom;
		private String model;
		private Boolean isWifiSupport;
		private Boolean isGraphicCardSupport;
		
		
		public Builder(String ram, String rom, String model) {
			super();
			this.ram = ram;
			this.rom = rom;
			this.model = model;
		}


		public Builder setIsWifiSupport(Boolean isWifiSupport) {
			this.isWifiSupport = isWifiSupport;
			return this;
		}


		public Builder setIsGraphicCardSupport(Boolean isGraphicCardSupport) {
			this.isGraphicCardSupport = isGraphicCardSupport;
			return this;
		}
			
		
		public BuilderDesignPatternComputer build() {
			
			return new BuilderDesignPatternComputer(ram, rom,model, isWifiSupport,isGraphicCardSupport);
		}
		
	}

	@Override
	public String toString() {
		return "BuilderDesignPatternComputer [ram=" + ram + ", rom=" + rom + ", model=" + model + ", isWifiSupport="
				+ isWifiSupport + ", isGraphicCardSupport=" + isGraphicCardSupport + "]";
	} 
	
	
	

}
