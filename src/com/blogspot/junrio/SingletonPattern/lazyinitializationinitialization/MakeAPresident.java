package com.blogspot.junrio.SingletonPattern.lazyinitializationinitialization;

public class MakeAPresident {
	private static MakeAPresident _president;
	
	//We make the constructor private to prevent the use of "new"
	private MakeAPresident() {
		
	}
	public static MakeAPresident getPresident() {
		
		// Lazy initialization
		if (_president == null) {
			_president = new MakeAPresident();
			System.out.println("New President selected.");
		} else {
			System.out.print("You already have a President."); 
			System.out.println("Send him for the all.");
		}
		return _president;
	}

}
