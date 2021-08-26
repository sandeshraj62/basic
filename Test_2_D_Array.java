package java_Array;

public class Test_2_D_Array {
	public static void main(String args[])
	{
		int[][] a= {{30,40},{60,70,80}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		  System.out.println();
		}
	}

}
