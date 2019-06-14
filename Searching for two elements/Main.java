import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int ind= in.nextInt();
      int a[]=new int[ind];
      for(int i=0;i<ind;i++)
        a[i]=in.nextInt();
      int s=in.nextInt();
      int p=in.nextInt();
      int m=0,n=0;
      int flag=0;
      for(int i=0;i<ind;i++)
      {
        if(a[i]==s){
          m=i;
        flag=1;
        break;
        }
      }
      if(flag==1)
          System.out.println(m);
      else
         System.out.println("-1");
      flag=0;
        for(int i=0;i<ind;i++)
      {
        if(a[i]==p)
        {
          n=i;
        flag=1;
          break;
        }
        }
      if(flag==1)
          System.out.println(n);
       else
         System.out.println("-1");
    }
}