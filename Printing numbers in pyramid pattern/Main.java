import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in=new Scanner(System.in);
       int n = in.nextInt();
	    int val = 1;
      int num=1;
	    for(int curr_row = 1; curr_row <= n; curr_row++)
	    {
            // Handle numbers for each row
          for(int space=1;space<=n-curr_row;space++){
            System.out.print(" ");
          }
	        for(int curr_col = 1; curr_col <=(curr_row); curr_col++)
	        {
	            System.out.print(num +" ");
              num=num+1;
	        }
	        
	        System.out.println();
	    }
    }    
}