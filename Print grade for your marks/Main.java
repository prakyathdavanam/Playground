import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int x=in.nextInt();
      if(x>=85)
        System.out.println("A");
      else if(x>=75&&x<85)
         System.out.println("B");
      else if(x>=65&&x<75)
         System.out.println("C");
      else if(x>=55&&x<65)
         System.out.println("D");
      else if(x>=45&&x<55)
         System.out.println("E");
      else
         System.out.println("Fail");
    }
}