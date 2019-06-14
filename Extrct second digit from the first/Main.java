import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int second=n;
      while(second>100)
      {
        second=second/10;
      }
      second=second%10;
      System.out.println(second);
	}
}