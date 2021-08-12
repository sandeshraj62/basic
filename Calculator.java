package smart_Programming;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int no1 =s.nextInt();
		System.out.println("Enter Second number:");
		int no2 =s.nextInt();
		System.out.println("Enter the symbol (+,-,*,/)");
		String symbol =s.next();
		int result;
		switch(symbol)
		{
		case "+" : result=no1+no2;
				   System.out.println("Addition is:"+result);
				   break;
		case "-" : result=no2-no1;
				   System.out.println("Substration is:"+result);
				   break;
		case "*" : result=no1*no2;
					System.out.println("Multiplication is:"+result);
					break;
		case "/" : result=no1/no2;
					System.out.println("Division is:"+result);
					break;
		default : System.out.println("Invalid Symbol:");
					break;
					
		}
		//System.out.println("Addition is:"+result);
		//System.out.println("Substration is:"+result);
		//System.out.println("Multiplication  is:"+result);
		//System.out.println("Division is:"+result);
		s.close();
		
		
	}

}
