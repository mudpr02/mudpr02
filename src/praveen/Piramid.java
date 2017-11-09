package praveen;

public class Piramid {

	public static void main(String[] args) 
	{
		//System.out.println("number of series is");
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
				//System.out.print("*");
				for(int k=5;k>=i;--k)
				{
					System.out.print("*");
					k=k+2;
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("");
				}
					//System.out.print("*");
					for(int k=5;k>=i;--k)
					{
						System.out.print("*");
						
					}
				
				//System.out.print(" ");
				System.out.print("\n");
				
			}
			
			
		}

	}
