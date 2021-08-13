package smart_Programming;
//leap year = condition- 1.must be divisible by 400. 2- must be divisible by4 and not divisible by100//
public class Leap_year {
	public static void main(String args[]) {
		int year=2004;
		if((year%400==0) || (year%4==0 && year%100!=0)) {
			System.out.println("Leap Year");
		}else
			System.out.println("Not a leap year");
			
	}

}
