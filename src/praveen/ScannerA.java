package praveen;

import java.util.Scanner;

public class ScannerA {

	public static void main(String[] args) 
	{
		String sName;
		int ID;
		float number;
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Student Name:");
		sName=sc.nextLine();
		System.out.print("Name of Student is:"+sName);
		
		System.out.println();
		System.out.print("Enter the ID of Student");
		ID=sc.nextInt();
		System.out.print("ID of student is:"+ID);
		
		System.out.println();
		System.out.print("Etner the Number of student:");
		number=sc.nextFloat();
		System.out.print("Number of student is:"+number);

	}

}
