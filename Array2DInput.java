import java.util.*;
public class Array2DInput
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int [][]a=new int[4][3];
    int i,j;
    System.out.println("Enter elements in Array:");
    for(i=0;i<4;i++)
    {
      for(j=0;j<3;j++)
      {
        a[i][j]=xyz.nextInt();
      }
    }
    System.out.println("Display Array:");
    for(i=0;i<4;i++)
    {
      for(j=0;j<3;j++)
      {
        System.out.printf("%d\t",a[i][j]);
      }
     System.out.println();
    }

    for(i=0;i<4;i++)
    {
      int sum=0;
      for(j=0;j<3;j++)
      {
        sum=sum+a[i][j];
        System.out.printf("%d\t",a[i][j]);
      }
     System.out.printf("=%d\n",sum);
    }
    

 }
}