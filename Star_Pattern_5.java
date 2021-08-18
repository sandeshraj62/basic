package star_pattern;
// *****
// -****
// --***
// ---**
// ----*
// -----
public class Star_Pattern_5 {
	public static void main(String args[])
	{
		for(int a=1;a<=6;a++)
		{
			for(int c=2;c<=a;c++)
			{
				System.out.print("-");
			}
			
			for(int b=6;b>=a;b--)
			{
				System.out.print("*");
			}
			
		 System.out.println();
		}
	}

}
