package smart_Programming;

public class Factorial_by_recursion
{   
	static int fact=1;
	public static void main(String args[])
	{
		int no=6;
		Factorial_by_recursion obj = new Factorial_by_recursion();
		obj.calcFact(no);
		//int res;
		System.out.println("Factorial of "+no+" is:" +fact);
	}
	void calcFact(int no)
	{
		if(no>=1)
		{
			fact=fact*no;
			calcFact(no-1);
		}
	}

}
