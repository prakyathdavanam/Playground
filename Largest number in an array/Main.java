import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner in = new Scanner(System.in);
      int ind= in.nextInt();
      int a[]=new int[ind];
      int great=0;
      for(int i=0;i<ind;i++)
        a[i]=in.nextInt();
       for(int i=0;i<ind;i++){
          //for(int j=i+1;j<ind;j++)
       
         if(a[i]>great)
         {
           great=a[i];
         }
            
       }
           System.out.print(great);
            
         
         
          
    }
}