package ControlStatements;

public class LoopingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int j=1;j<=10;j++) {
			sum=sum+sum;
		}
		System.out.println("the sum of first 10 natural numbers is"+sum);
	}
}