package java_Array;
// 2D array basic:
public class Array_3 {
	public static void main(String args[])
	{
		int[][] a= {{1,2,3,4},{5,6},{7,8,9}};
		{
			System.out.println(a[1].length);
		}
	}

}             // a=1         a=2          a=3
//    A=    (1,2,3,4)  ||   (5,6)  ||     (7,8,9)
//   Array start counting with 0
//   A[0]      [0]=1     [1]=2   [2]=3  [3]=4               ==(1,2,3,4)
//   A[1]       [0]=5     [1]=6                              ==(5,6)
//   A[2]       [0]=7     [1]=8   [2]=9                      ==(7,8,9)