package com.tns.programs;

public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method 
// java variable example : narrowing (type casting)
		float f = 10.5f;
		// int a =f ; //compile time error
		int a = (int)f;
		System.out.println(f);
		System.out.println(a);

	}

}