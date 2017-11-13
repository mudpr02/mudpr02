package praveen;

class GFather 
{
	void eat()
	{
		System.out.println("Eating food");
	}
}

class Father extends GFather
{
	void vhai()
	{
		System.out.println("Extends from GFather");
	}
}

public class Gchild extends Father
{
	void Child(){
		System.out.println("ChildClass");
	}
	
	
	public static void main(String[] args) 
	{
		Gchild c= new Gchild();
		c.eat();
		c.Child();c.vhai();
		
	}
		
}
