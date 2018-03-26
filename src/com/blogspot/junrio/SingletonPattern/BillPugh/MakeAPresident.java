package com.blogspot.junrio.SingletonPattern.BillPugh;

public class MakeAPresident {

	// eager initialization
	private static MakeAPresident _president;

	// We make the constructor private to prevent the use of "new"
	private MakeAPresident() {

	}

	// Bill Pugh solution
	private static class SingletonHelper {
		// Nested class is referenced after getPresident() is called
		private static final MakeAPresident _president = new MakeAPresident();
	}

	public static MakeAPresident getPresident() {

		return SingletonHelper._president;
	}

}
