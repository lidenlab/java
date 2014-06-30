package com.lidenlab.designpatterns.command;

public class Invoker {
	private Command commandDoThat, commandDoThis;
	
	public Invoker(Command commandDoThis, Command commandDoThat){
		this.commandDoThis = commandDoThis;
		this.commandDoThat = commandDoThat;
	}
	
	void doThis(){
		commandDoThis.execute();
	}
	
	void doThat(){
		commandDoThat.execute();
	}
}
