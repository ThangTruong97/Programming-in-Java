package lab2;

import java.util.Scanner;

public class First_degree_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Type a : ");
		double a=scan.nextDouble();
		System.out.print("Type b : ");
		double b=scan.nextDouble();
		scan.close();
		if(a==0 && b!=0) System.out.println("The equation doesn't have any root");
		else if(a==0 && b==0) System.out.println("The equation has a lot of root");
		else 
		{
			double x=-b/a;
			System.out.printf("A root of the equation is : %f", x);
		}
		

	}

}
