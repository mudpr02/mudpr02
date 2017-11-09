package praveen;

public class Piramid2 {

	public static void main(String[] args) 
	{
		//System.out.println("number of series is");
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
				//j=2;
			}
				//System.out.print("*");
				for(int k=5;k>=i;k--)
				{
					System.out.print("*");
				}
				for (int l=4;l>=i;l--)
				{
					System.out.print("*");
				}
				//System.out.print(" ");
				System.out.print("\n");
				
			}
			
			
		}

	}
