package java_Array;

public class Array_1 {
	public static void main(String args[]) 
	{
		//int[] a; // declaring an array.
		//a =new int[5] ;// creating an array  //  name ka array
		// Declaring and creating of an array can be done in this way also:
		// Method 1:
		int[]  b= new int[5];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]+",");
		}
		// method 2:
 //		=====================================
		int[] a ={1,2,3,4,5};
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+",");
		
		}
}
}
