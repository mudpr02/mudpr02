package praveen;

public class Test
{
	void abc(int a,int b)
	{
		System.out.println("Sum of Numebr is"+(a+b));
	}
	void abc (float a,float b)
	{
		System.out.println("Sum of Number is"+(a+b));
	}
	
	public static void main(String args[])
	{
		Test t =new Test();
		t.abc(2.5f, 3.5f );
		t.abc(2, 3);
	}
}