package com.blogspot.junrio.ObserverPattern;

public interface ISubject {
	void register(Fan f);

	void unregister(Fan f);

	void notifyObservers();

}
