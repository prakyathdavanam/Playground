import java.util.Scanner;
class Main
{
  public static int sum_of_numbers(int y)
	{

	    
	    int    sum = y*y;
	    
	    return sum;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
       Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(sum_of_numbers(n)); // Function call
	}
    // Function to find the sum of numbers
	
	
}