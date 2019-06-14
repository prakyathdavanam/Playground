import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
        int temp=n;
      
      int sum=0;
        while(n>0)
        {
      int p=n%10;
          int fact=1;
      n=n/10;
      for(int i=1;i<=p;i++)
        fact=fact*i;
          sum=sum+fact;
        }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
        
	}
}