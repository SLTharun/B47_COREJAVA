package com.tns.exception;

public class MultipleCatchBlock2 {

	public static void (String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[] = new int [5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bound Exception occurs");
			
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code...");
	}

}
