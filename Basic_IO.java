package lab1;

import java.util.Scanner;

public class Basic_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Student name : ");
		String Name=scan.nextLine();
		System.out.print("Score : ");
		double score=scan.nextDouble();
		scan.close();
		System.out.println("---------------------------------------");
		System.out.printf(" %s %f score",Name,score );

	}

}
