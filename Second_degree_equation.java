package lab2;

import java.util.Scanner;

public class Second_degree_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Type a : ");
		double a=scan.nextDouble();
		System.out.print("Type b : ");
		double b=scan.nextDouble();
		System.out.print("Type c : ");
		double c=scan.nextDouble();
		scan.close();
		double delta=Math.pow(b, 2)-(4*a*c);
		if(Math.sqrt(delta)<0) System.out.println("The equation doesn't have any root");
		else if(Math.sqrt(delta)==0) System.out.printf("The equation has a root : %f",-b/(2*a));
		else if(Math.sqrt(delta)>0)
		{
			double x1=(-b-Math.sqrt(delta))/(2*a);
			double x2=(-b+Math.sqrt(delta))/(2*a);
			System.out.printf("The equation has two root : %f and %f", x1,x2);
		}

	}

}
