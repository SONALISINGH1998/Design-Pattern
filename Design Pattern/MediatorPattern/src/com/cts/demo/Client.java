package com.cts.demo;

public class Client {

	public static void main(String[] args) {
		IUser user1=new BasicUser("Sonali1");
		IUser user2=new PremiumUser("Sonali2");
		
		ChatMediator chatmed=new ChatMediator();
		chatmed.addUser(user1);
		chatmed.addUser(user2);
		
		chatmed.sendMessage("Hello All!!");
	}

}
