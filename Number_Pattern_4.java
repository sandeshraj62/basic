package star_pattern;
// 1
// 23
// 456
// 78910
public class Number_Pattern_4 {
	public static void main(String args[])
	{
		int anmol=0;
		for(int a=1;a<=5;a++)
		{
			for(int j=1;j<=a;j++)
			{
				anmol=anmol+1;
				System.out.print(anmol);
			}
			System.out.println();
		}
	}

}
