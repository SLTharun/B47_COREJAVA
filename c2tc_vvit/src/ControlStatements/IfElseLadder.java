package ControlStatements;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 65;
		if(marks<50) {
			System.out.println("fail");
		}
		else if(marks>=50&&marks<60){
			System.out.println("D Grade");
		}
		else if(marks>=60&&marks<70) {
			System.out.println("C Grade");
		}
		else if(marks>=70&&marks<80) {
			System.out.println("B Grade");
		}
		else if(marks>=80&&marks<90) {
			System.out.println("A Grade");
		}
		else if(marks>=80&&marks<=100) {
			System.out.println("A+ Grade");
		}

	}

}
