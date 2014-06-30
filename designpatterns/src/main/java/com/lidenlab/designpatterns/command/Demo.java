package com.lidenlab.designpatterns.command;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Receiver receiver = new ReceiverImpl();
		
		CommandDoThis commandDoThis = new CommandDoThis(receiver);
		CommandDoThat commandDoThat = new CommandDoThat(receiver);

		Invoker invoker = new Invoker (commandDoThis, commandDoThat);
		
		invoker.doThis();
		invoker.doThat();
	}

}
