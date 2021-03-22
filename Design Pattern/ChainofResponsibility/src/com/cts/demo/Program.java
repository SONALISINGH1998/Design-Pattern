package com.cts.demo;

public class Program {
	
	public static void main(String[] args) {
		
		LeaveRequest lr1=new LeaveRequest("Sonali1", 2);
		LeaveRequest lr2=new LeaveRequest("Sonali2", 6);
		LeaveRequest lr3=new LeaveRequest("Sonali3", 5);
		LeaveRequest lr4=new LeaveRequest("Sonali4", 3);

		ILeaveRequestHandler ilrh=new Supervisor();
		
		ilrh.handleRequest(lr1);
		ilrh.handleRequest(lr2);
		ilrh.handleRequest(lr3);
		ilrh.handleRequest(lr4);
		
	}
}
