package ControlStatements;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "delhi,india";
		if(address.endsWith("india")) {
			if(address.contains("meerut")) {
				System.out.println("your city is meerut");
			}
			else if(address.contains("noida")) {
				System.out.println("yout city is noida");
			}else {
				System.out.println(address.split(",")[0]);
			}
		}else {
			System.out.println("you're living in india");
		}
	}
}