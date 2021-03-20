package com.cts.demo.singleton;

public class DBConn {
	
	private static DBConn instance=new DBConn();
	
	private DBConn() {		
	}
	
	static DBConn getInstance() {
		return instance;
	}
	
	public void caller() {
		System.out.println(DBConn.getInstance());
		
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	DBConn object=DBConn.getInstance();
		object.caller();
	
	}

}
