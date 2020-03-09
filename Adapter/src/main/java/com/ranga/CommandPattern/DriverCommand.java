package com.ranga.CommandPattern;

public class DriverCommand {
	public DriverCommand() {
		System.out.println();
		System.out.println("Command Pattern");
		RemoteControl control =new RemoteControl();
		Light light = new Light();
		Command lightsOn = new LightsOnCmd(light);
		Command lightsOff = new LightsOnCmd(light);
		control.setCommand(lightsOn);
		control.pressButton();
		control.setCommand(lightsOff);
		control.pressButton();
	}
}
