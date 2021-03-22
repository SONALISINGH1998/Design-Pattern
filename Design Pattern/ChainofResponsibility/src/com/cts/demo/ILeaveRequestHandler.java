 package com.cts.demo;

public interface ILeaveRequestHandler {
	
	public ILeaveRequestHandler nextHandler=null;
	
	public void handleRequest(LeaveRequest leaverequest);
}
