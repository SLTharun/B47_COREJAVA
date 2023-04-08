package com.tns.exception;

public class MultipleCatchBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[5];
			a[5] = 30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs...");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception occurd");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Occurs...");
		}
		System.out.println("rest of the code...");

	}

}
