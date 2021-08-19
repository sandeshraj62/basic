package star_pattern;

public class Star_Pattern_8 
{
	public static void main(String args[])
	{
		for(int a=1;a<=4;a++)
		{
			for(int b=3;b>=a;b--)
			{
				System.out.print("-");
			}
			for(int c=1;c<=a;c++)
			{
		    System.out.print("*");
		    }
			for(int d=2;d<=a;d++)
			{
		    System.out.print("*");
		     }
			for(int e=3;e>=a;e--)
			{
				System.out.print("-");
			}
		 System.out.println();
	
	}
 }
}