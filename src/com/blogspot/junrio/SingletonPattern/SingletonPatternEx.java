package com.blogspot.junrio.SingletonPattern;

public class SingletonPatternEx {
	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo***\n");
		System.out.println("Trying to make a president for our country");
		MakeAPresident c1 = MakeAPresident.getPresident();
		System.out.println("Trying to make another president for our country");
		MakeAPresident c2 = MakeAPresident.getPresident();
		if (c1 == c2) {
			System.out.println("c1 and c2 are same instance");
		}
	}
}
