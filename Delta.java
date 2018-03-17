package lab1;

import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Type a : ");
		double a=scan.nextDouble();
		System.out.print("Type b : ");
		double b=scan.nextDouble();
		System.out.print("Type c : ");
		double c=scan.nextDouble();
		double delta=Math.pow(b,2)-(4*a*c);
		System.out.printf("Square root of Delta : %f", Math.sqrt(delta));
		scan.close();
	}

}
