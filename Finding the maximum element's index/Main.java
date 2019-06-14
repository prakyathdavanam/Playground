import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
    int max;
int list[] = new int[n];
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
}
    if(list[0]>list[1])
    max=0;
    else max=1;
    for(int i=2;i<n;i++)
    {
      if(list[i]>list[max])
        max=i;
    }
    System.out.print(max);
  }
}