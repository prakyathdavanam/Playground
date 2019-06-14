import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int mat[][]=new int[r][c];
    int mat1[][]=new int[r][c];
    int dif[][]=new int[r][c];
     for(int i=0;i<r;i++){
     for(int j=0;j<c;j++) {
       mat[i][j]=in.nextInt();
     }
     }
       for(int i=0;i<r;i++){
     for(int j=0;j<c;j++) {
       mat1[i][j]=in.nextInt();
     }
       }
    for(int i=0;i<r;i++){
     for(int j=0;j<c;j++) {
       dif[i][j]=mat[i][j]-mat1[i][j];
     }
    }
    for(int i=0;i<r;i++){
     for(int j=0;j<c;j++){
       System.out.print(dif[i][j]+" ");
    }
    System.out.print("\n");
    }
  }
}