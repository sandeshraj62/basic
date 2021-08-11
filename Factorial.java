package smart_Programming;
// Factorial Method 1 //
public class Factorial 
{ 
	public static void main(String args[])
	{
		int no=6,fact=1;
		for(int i=1;i<=no;i++) {
			
			fact=fact*i;
		}
		System.out.println("Factorial of 6 is:"+fact);

	// Method number 2- for calculating factorial //
	{
		int num=5,factorial=1;
		for(int i=num;i>=1;i--)
	{
			factorial=factorial*i;
			}
		System.out.println("Factorial of 5 is:"+factorial);
	}

 }
}