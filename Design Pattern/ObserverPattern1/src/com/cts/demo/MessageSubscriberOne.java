package com.cts.demo;

public class MessageSubscriberOne implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

	@Override
	public void updateState(State s) {
		System.out.println("StateSubscriberOne :: " + s.getState());		
	}

}
