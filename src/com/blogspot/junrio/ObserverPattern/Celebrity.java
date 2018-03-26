package com.blogspot.junrio.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements ISubject {

	private String fullName;

	private int weight = 50;

	List<Fan> observerList = new ArrayList<Fan>();

	public Celebrity(String fullName, int weight) {
		this.fullName = fullName;
		this.weight = weight;
	}

	@Override
	public void register(Fan f) {
		observerList.add(f);
		System.out.println(f.fullName + " is following " + this.getFullName() + ".");

	}

	@Override
	public void unregister(Fan f) {
		observerList.remove(f);
		System.out.println(f.fullName + " unfollowed " + this.getFullName() + ".");

	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observerList.size(); i++) {
			observerList.get(i).updateWeight(fullName, getWeight());
		}

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
		System.out.println(this.fullName + " now is " + this.weight + " kg.");
		notifyObservers();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
