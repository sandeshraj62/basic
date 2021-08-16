package star_pattern;
// 12345
// 1234
// 123
// 12
// 1 
public class Number_Pattern_2 {
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
