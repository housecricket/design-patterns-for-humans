package com.blogspot.junrio.SingletonPattern.eagerinitialization;

public class MakeAPresident {

	// eager initialization
	private static MakeAPresident _president = new MakeAPresident();

	// We make the constructor
	// private to prevent the use of "new"
	private MakeAPresident() {
	}

	// Global point of access
	// MakeACaptain.getCaptain()
	// is a public static method
	public static MakeAPresident getPresident() {
		return _president;
	}
}
