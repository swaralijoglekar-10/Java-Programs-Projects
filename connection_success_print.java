package com.swarali_integrity;

public class connection_success_print {
	
	private String hostName;
	private int Port;
	private String userName;
	private String password;
	
	public void setValues(String host, int port, String user, String password) {
		this.hostName= host;
		this.Port= port;
		this.userName= user;
		this.password= password;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		connection_success_print csp= new connection_success_print();
		csp.setValues("P01211142", 7001,"joglesar" , "1234");
		
		if(csp==null)
			System.out.print("Connection failed.");
		else
			System.out.print("Connection successful.");
	}
	
	// private members
			// set hostname, port, username, password
			// hostname- P01211142
			// port -7001
			// 
			// method chaining
			// print successful
			// try catch
	
}
