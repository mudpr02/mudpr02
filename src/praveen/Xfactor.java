package praveen;

class X
{
	int a=5;
 void methodX()
 {
	 System.out.println("Parent Class");
 }
}

class Y extends X
{
	
	 int a=7;
	public static void main(String[] args) {
		Y x = new Y();
		System.out.println(x.a);
	}
void methodY()
{
		
	System.out.println("Child class");
}
}
class Xfactor{

/*public class Xfactor extends Y 
{
	public static void main(String agrs[])
	{
		Xfactor f=new Xfactor();
		f.methodX();
		f.methodY();
		System.out.println("Sub-Child class with main method");
	}
*/}
