package star_pattern;
// 1      1 
// 12     22
// 123    333
// 1234   4444
// 12345  55555

public class Number_Pattern_1 {
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
 }
}