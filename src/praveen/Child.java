package praveen;

 class Parent 
{
	void printa()
	{
	System.out.println("This is parent class");
	}
}

public class Child extends Parent
{
	void printb()
	{
		System.out.println("Child class");
	}
	public static void main(String...agrs)
	{
		Child c=new Child();
		c.printa();
		c.printb();
	}
	
}
