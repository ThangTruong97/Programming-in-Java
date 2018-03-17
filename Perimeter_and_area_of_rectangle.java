package lab1;

import java.util.Scanner;

public class Perimeter_and_area_of_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("The length of the rectangle : ");
		double length=scan.nextDouble();
		System.out.print("The height of the rectangle : ");
		double height=scan.nextDouble();
		scan.close();
		System.out.println("-------------------------------------");
		System.out.printf("The perimeter of the rectangle : %f\n", 2*(length+height));
		System.out.printf("The area of the rectangle : %f",length*height);
		

	}

}
