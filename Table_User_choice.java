package smart_Programming;
import java.util.Scanner;
public class Table_User_choice {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number below 10 :");
		int table = s.nextInt();
		System.out.println("Table of number is:"+table);
		for(int i=0;i<=10;i++)
		{
			System.out.println(table+ "X" +i+ "=" +table*i);
		}
		s.close();
		
	}

}
