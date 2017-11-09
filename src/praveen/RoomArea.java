package praveen;

class Room
{
	float length;
	float breadth;
	
	void getdata(float a,float b)
	{
		length=a;
		breadth=b;
	}
}

public class RoomArea {

	public static void main(String[] args) 
	{
		float area;
		Room room1=new Room();
		room1.getdata(20, 10);
		area=room1.breadth*room1.length;
		
		System.out.println("Area is: "+area);

	}

}
