package praveen;

//import java.util.Scanner;

class addition
{
	void add()
	{
		System.out.println("praveen");
	}
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}


public class MethodOver {

	public static void main(String[] args) 
	{
		addition a=new addition();
		a.add(10, 20);
		a.add();

	}

}
