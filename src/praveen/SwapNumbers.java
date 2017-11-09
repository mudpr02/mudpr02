package praveen;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int a,b,c=0;
		//SwapNumbers sn=new SwapNumbers();
		@SuppressWarnings("resource")
		Scanner abc = new Scanner(System.in);  // Reading from System.in
		System.out.print("Enter a First Number: ");
		a = abc.nextInt(); // Scans the next token of the input as an integer
		
		@SuppressWarnings("resource")
		Scanner reader =new Scanner(System.in);
		System.out.print("Enter a Second Numebr: ");
		b=reader.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swappping first value is: "+a);
		System.out.println("After Swappping second value is: "+b);
	
	}

}
