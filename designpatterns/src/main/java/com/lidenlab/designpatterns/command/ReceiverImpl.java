package com.lidenlab.designpatterns.command;

public class ReceiverImpl implements Receiver {

	@Override
	public void doThis() {
		System.out.println("Do this");
	}

	@Override
	public void doThat() {
		System.out.println("Do that");		
	}

}
