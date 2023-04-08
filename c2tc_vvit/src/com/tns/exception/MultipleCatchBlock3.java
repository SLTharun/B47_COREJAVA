package com.tns.exception;

public class MultipleCatchBlock3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int [5];
			a[5]=30/0;
			System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs....");
		}
		catch(ArrayIndexOutOfBoundsExcepton e) {
			System.out.println("ArrayIndexOutOfBonds exceptions occurs...");
		}
		catch(Exception e) {
			System.out.println("ParentException occurs....");
		}
		System.out.println("Rest of the code...");

	}

}
