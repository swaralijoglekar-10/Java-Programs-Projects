package com.swarali_integrity;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display();

		// long l2= 2_000_00_000_00; Out of Range error
		long l2 = 2_000_00_000_00L; // write L at the end to tell the compiler that it's long

		// float f1= 5.89; error- cannot convert from double to float
		// because 5.89 is considered as double
		float f1 = 5.89f;
		System.out.println(l2 + f1);

		// char c1= 700000; // this is out of range 0 to 65535
		char c2 = 95; // character with number 95 in unicode will be assigned to c2
		System.out.println(c2);

		var x = 34;
		System.out.println(x);

		byte y = 120;
		// byte y1= 300; // Cannot convert from int to byte
		byte y1 = (byte) 300;
		System.out.println(y1);

		byte y2 = (byte) 129;
		System.out.println(y2); // -127

		byte y3 = (byte) 4.5;
		System.out.println(y3); // 4

	}

	public static void display() {
		long l1 = 2_00_000;
		double d1 = 200_000.5678;
		System.out.println(l1 + d1);
	}

}
