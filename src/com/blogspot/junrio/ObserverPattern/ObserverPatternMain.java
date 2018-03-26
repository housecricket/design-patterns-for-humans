package com.blogspot.junrio.ObserverPattern;

public class ObserverPatternMain {
	public static void main(String[] args) {
		Celebrity Ronaldo = new Celebrity("Ronaldo", 90);
		Fan f1 = new Fan(0, "Quang Hai");
		Fan f2 = new Fan(1, "Tien Dung");
		Ronaldo.register(f1);
		Ronaldo.register(f2);
		Ronaldo.setWeight(90);
		Ronaldo.unregister(f1);
		Ronaldo.setWeight(85);
	}
}
