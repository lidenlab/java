package com.lidenlab.designpatterns.command;

public class CommandDoThis implements Command {

	Receiver receiver;

	public CommandDoThis(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.doThis();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
	}

}
