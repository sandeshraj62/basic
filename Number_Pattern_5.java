package star_pattern;
// 1
// 21 
// 321
// 4321
// 54321

public class Number_Pattern_5 {
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b>=a;b++)
			{
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
