import java.util.*;
public class ArraySum1
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int[]a=new int[5];
   int sum=0,i;
   System.out.println("Enter elemnts in Array:");
   for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    }
   for(i=0;i<a.length;i++)
    {
      sum=sum+a[i];
    }
   System.out.println("The sum of Elements in Array is: "+sum);
 }
}