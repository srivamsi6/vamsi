package calc;

import java.util.Scanner;

public class MyCalculater {
	
	public int sum(int a, int b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		MyCalculater calc =  new MyCalculater();
		Scanner sn = new Scanner(System.in);
	    System.out.println("Enter First Number:");
	    int numb1 = sn.nextInt();
	    System.out.println("Enter Second Number:");
	    int numb2 = sn.nextInt();
		System.out.println(calc.sum(numb1, numb2));
		System.out.println(calc.minus(numb1, numb2));
        System.out.println(calc.multiply(numb1, numb2));
        System.out.println(calc.division(numb1, numb2));


		

	}

}


