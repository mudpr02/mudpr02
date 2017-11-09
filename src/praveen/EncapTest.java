package praveen;

class Encap
{
	private String name;
	
	public void setMethod(String name)
	{
		this.name=name;
	}
	public String getMethod()
	{
		return name;
	}
}


class EncapTest {

	public static void main(String[] args) 
	{
		Encap e=new Encap();
		e.setMethod("Ram");
		System.out.println(e.getMethod());

	}

}
