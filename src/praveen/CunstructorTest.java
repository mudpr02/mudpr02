package praveen;

class Cust
{
	Cust(int a, int b)
	{
		System.out.println(a+" "+b);
	}
	Cust(int a,String name,float c)
	{
		System.out.println(a+name+c);
	}
	Cust(String name,int age,char c)
	{
		this(10,20);
			
	}
}

public class CunstructorTest 
{
	public static void main(String[] args) 
	{
	     new Cust(101,11);
	     new Cust(8,"kamal",9f);
	}

}
