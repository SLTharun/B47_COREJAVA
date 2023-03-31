package com.tns.Operators;

public class JavaOperatorsShiftingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for positive number >> and >>> works same
		System.out.println(20>>2);
		System.out.println(20>>>2);
		//for negative number, >>> changes parity bit (MSB) to 0
		System.out.println(-20>>2);
		System.out.println(-20>>>2);
	}
}