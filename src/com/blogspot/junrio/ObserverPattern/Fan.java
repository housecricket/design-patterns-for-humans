package com.blogspot.junrio.ObserverPattern;

import java.util.Formatter;

public class Fan {
	
	int id;
	String fullName;
	public Fan(int id, String fullName) {
		this.id = id;
		this.fullName = fullName;
		
	}
	public void updateWeight(String name, int weight) {
		StringBuilder message = new StringBuilder();
		Formatter fmt = new Formatter(message);
		fmt.format("My name is %s. I was notified that %s is %d kg.", fullName, name, weight);
		System.out.println(message.toString());
	}

}
