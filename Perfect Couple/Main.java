import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int val=in.nextInt();
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          sum=a[i]+a[j];
          if(val==sum){
            System.out.print(a[i]+", "+a[j]);
            System.out.print("\n");
          }
        }}
      
    }
}