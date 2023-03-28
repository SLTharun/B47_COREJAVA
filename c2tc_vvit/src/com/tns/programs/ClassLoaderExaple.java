package com.tns.programs;

public class ClassLoaderExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lets print the class loader name of current class
		//application/system class loader will load this class
		Class c = ClassLoaderExaple.class;
		System.out.println(c.getClassLoader());
		/*
		 * if we print class loader name of a string, it will print null because it is an
		 * inbuilt class which is found in rt.jar, so it is loaded by bootstrap class loader
		 */
		System.out.println(String.class.getClassLoader());
	
	
	}

}