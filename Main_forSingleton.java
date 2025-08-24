package com.swarali_integrity;

class App{
	
	private static App app;
		
	// function in which instance will be created
	private App() {
		
	}
		
	public static App getInstance() {
		System.out.println(app);
		app = new App();
		System.out.println(app);
		return app;
	
		// everytime we write new App(), new memory location will be there. 
	}
	
}


public class Main_forSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		App app= App.getInstance();
		App app2= App.getInstance();
		
	}

}
