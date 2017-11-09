package praveen;

import java.util.Scanner;

public class ScanClass {

	public static void main(String[] args) 
	{	int fact=1;
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value for you want to calculate:");
		int number= scan.nextInt();
		
		for(int i=1;i<=number;i++)
		{
		 fact=fact*i;
		 
		}
		System.out.println("Factrorial of number is:"+fact);
		
	}
}
