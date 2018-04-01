package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Example2 {
	static Scanner scan=new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> array=new ArrayList<String>();

System.out.println("------------------------------");
System.out.println("1.Type the list of Names");
System.out.println("2.Print out the list of Names (nature)");
System.out.println("3.Print out the list of Names (random)");
System.out.println("4.Print out the list of Names (in descending order)");
System.out.println("5.Find and delete a name from the list of Names");
System.out.println("6.Exit");
System.out.println("-------------------------------");
System.out.print("Type in your choice : ");
int choice=scan.nextInt();
if(choice==1)
{
	String name1=scan.nextLine();
	while(true)
	{
		
		System.out.print("Type in a name : ");
		String name=scan.nextLine();
		array.add(name);
		System.out.print("Do you want to continue (Y/N) : ");
		if(scan.nextLine().equals("N")) break;
	}
	System.out.print("Type in your choice : ");
	int choice1=scan.nextInt();

if(choice1==2)
{
	System.out.println("The list of Name is : ");
	for(int i=0;i<array.size();i++)
	{
		System.out.printf("%d.%s\n", i+1,array.get(i));
	}
}
else if(choice1==3)
{
	Collections.shuffle(array);
	System.out.println("The list of Name is : ");
	for(int i=0;i<array.size();i++)
	{
		System.out.printf("%d.%s\n", i+1,array.get(i));
	}
}
else if(choice1==4)
{
	Collections.sort(array);
	Collections.reverse(array);
	System.out.println("The list of Name is : ");
	for(int i=0;i<array.size();i++)
	{
		System.out.printf("%d.%s\n", i+1,array.get(i));
	}
}
else if(choice1==5)
{
	String findName1=scan.nextLine();
	System.out.print("Type in a name : ");
	String findName=scan.nextLine();
	System.out.printf("The List after remove %s is : \n",findName);
	for(int i=0;i<array.size();i++)
	{
		if(array.get(i).equals(findName)) array.remove(i);
	}
	
	for(int i=0;i<array.size();i++)
	{
		System.out.printf("%d.%s\n", i+1,array.get(i));
	}
	
}


	}
scan.close();
}
	
}