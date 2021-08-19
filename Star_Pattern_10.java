package star_pattern;
// *******
// -*****-
// --***--
// ---*---
public class Star_Pattern_10 {
	public static void main(String args[])
	{
		for(int a=1;a<=4;a++)
		{
			for(int b=1;b<=a;b++) 
			{
				System.out.print("-");
			}
			for(int c=4;c>=a;c--)
			{
				System.out.print("*");
			}
			for(int d=3;d>=a;d--)
			{
				System.out.print("*");
			}
		    System.out.println();
		}
	}

}
