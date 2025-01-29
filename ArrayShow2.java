import java.util.*;
public class ArrayShow2
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int[]a=new int[5];
   int i;
   System.out.println("Enter elemnts in Array:");
   for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    }
   System.out.println("Display Array:");
   for(i=0;i<a.length;i++)
    {
      System.out.printf("%d\t",a[i]);
    }   
 }
}