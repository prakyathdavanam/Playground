import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int last=n%10;
      int first=n;
      int sum=0;
      while(first>10)
      {
        first=first/10;
      }
      sum=first+last;
      System.out.println(sum);
	}
}