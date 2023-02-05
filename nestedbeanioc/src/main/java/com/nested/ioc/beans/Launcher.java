package com.nested.ioc.beans;

public class Launcher {

	private int lanchpad;
	private Rocket rocket;
	
	public int getLanchpad() {
		return lanchpad;
	}
	public void setLanchpad(int lanchpad) {
		this.lanchpad = lanchpad;
	}
	public Rocket getRocket() {
		return rocket;
	}
	public void setRocket(Rocket rocket) {
		this.rocket = rocket;
	}
	
	public void lanunc() {
		System.out.println("lanuch rocket");
	}
	
}
