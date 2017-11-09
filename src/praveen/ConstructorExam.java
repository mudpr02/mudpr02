package praveen;

public class ConstructorExam {

	String car_name,company;
	int average,speed,engine;
	
	void add(String car,String comp, int avg,int speed1,int engine1)
	{
	car_name=car;
	company=comp;
	average=avg;
	speed=speed1;
	engine=engine1;
	}
	
	void printa()
	{
		System.out.println("Name of car is:"+car_name);
		System.out.println("company of car is:"+company);
		System.out.println("average of car is:"+average);
		System.out.println("speed of car is:"+speed);
		System.out.println("engine   of car is:"+engine);
	}
	
	
	public static void main(String[] args) 
	{
	@SuppressWarnings("unused")
	ConstructorExam c=new ConstructorExam();

	}

}
