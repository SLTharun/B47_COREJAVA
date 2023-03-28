package com.tns.programs;

public class AddingLowerType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java variable example: adding lower type 
		byte a = 10;
		byte b = 10;
		// byte c = a+b; // compile time error: because a+b = 20 will be int
		byte c = (byte)(a+b);
		System.out.println(c);
		

	}

}