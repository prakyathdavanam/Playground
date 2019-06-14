import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
      int mul=1;
	    // Take numbers from 2 to given number
	    // Check each number until it reaches the given number
	    int m= in.nextInt();
      for(int i=1;i<=m;i++)
         mul=mul*n;
      System.out.println(mul);
    }
}