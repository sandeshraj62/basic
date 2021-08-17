package star_pattern;
// 1
// 12
// 123
// 1234
// 12345
public class Number_Pattern3 {
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
		   for(int b=1;b<=a;b++) 
		   {
			   System.out.print(b);
		   }
		   for(int c=1;c<=a;c++)
		   {
			   System.out.print("-");
		   }
		   System.out.println();
		}
	}

}
