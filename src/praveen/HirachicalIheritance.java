package praveen;


class Animal
{
	void Eat()
	{
		System.out.println("Eat");
	}
}

class Cow extends Animal
{
	void vhai()
	{
		System.out.println("vhai vhai");
	}
}

class Cat extends Animal
{
	void meao()
	{
		System.out.println("Meaooooooo");
	}
}
public class HirachicalIheritance {

	public static void main(String[] args) 
	{
		Cat c= new Cat();
		c.Eat();
		c.meao();
		
		Cow c1= new Cow();
		c1.Eat();
		c1.vhai();

	}

}
