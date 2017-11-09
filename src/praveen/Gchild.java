package praveen;

class GFather 
{
	void eat()
	{
		System.out.println("Eating");
	}
}

class Father extends GFather
{
	void vhai()
	{
		System.out.println("Vhai Vhai");
	}
}

public class Gchild extends Father
{
	void Harmi(){
		System.out.println("G Harami");
	}
	
	
	public static void main(String[] args) 
	{
		Gchild c= new Gchild();
		c.eat();
		c.Harmi();c.vhai();
		
	}
		
}