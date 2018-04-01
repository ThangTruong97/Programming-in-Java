package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
ArrayList <Double> a=new ArrayList<Double>();
while(true)
{
	System.out.print("Type a number : ");
	double x=scan.nextDouble();
	a.add(x);
	String c=scan.nextLine();
	System.out.print("Do you want to continue ? (Y/N): ");
	if(scan.nextLine().equals("N")) break;
}
scan.close();
System.out.println("---------------------------------");
System.out.print("The list of the typed numbers : ");
double sum=0;
for(int i=0;i<a.size();i++)
{
	System.out.printf("%f ",a.get(i));
	sum+=a.get(i);
}
System.out.printf("\nThe sum of List's elements : %f",sum);
	}

}
