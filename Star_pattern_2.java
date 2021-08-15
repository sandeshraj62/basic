package star_pattern;
//     *
//    **
//   ***
//  ****
// *****
public class Star_pattern_2 {
   public static void main(String args[]){
	         for(int i=1;i<=4;i++)
	         {
	        	 
	        	 for(int j=3;j>=i;j--)
	        	 {
	        		 System.out.println("-");
	        	 }
	        	 for(int k=1;k<=i;k++)
	        	 {
	        		 System.out.print("*");
	        	 }
	        	 
	        	 System.out.println();	 
		         }
      }
   }
