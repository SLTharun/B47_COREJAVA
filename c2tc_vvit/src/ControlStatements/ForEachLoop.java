package ControlStatements;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"java","c","c++","python","javascript"};
		System.out.println("printing the contents of the names:\n");
		for(String name:names){
			System.out.println(name);
		}
	}
}