package com.swarali_integrity;

// this is trial code. Don't refer this

class Laptop{
	private Processor p;
	
	public Laptop() {
		//System.out.println(p);
		p= new Processor();
		//System.out.println(p);
		//p.generation=11;
		//System.out.println(p.generation);
	}
	
	public void setGen(int g) {
		p.generation=g;
	}
	public int getGen() {
		return p.generation;
	}
	
}

class Processor{
	int generation;
}

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop lp= new Laptop();
		lp.setGen(11);
		System.out.println(lp.getGen());
		
		Processor p1= new Processor();
		System.out.println(p1.generation=10); 
		
	}

}
