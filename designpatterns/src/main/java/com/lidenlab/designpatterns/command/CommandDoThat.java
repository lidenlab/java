package com.lidenlab.designpatterns.command;

public class CommandDoThat implements Command {

	Receiver receiver;

	public CommandDoThat(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.doThat();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
	}

}
