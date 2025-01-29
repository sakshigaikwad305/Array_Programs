import java.util.*;
public class ArraySum
{ 
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[],i,sum=0;
   a=new int[6];
   System.out.println("Enter Elements in Array:");
   for(i=0;i<a.length;i++)
   {
       a[i]=xyz.nextInt();
   }
   System.out.println("Display Elements:");
   for(i=0;i<a.length;i++)
    {
       System.out.printf("%d\t",a[i]);
    }
   for(i=0;i<a.length;i++)
    {
       sum=sum+a[i];
    }
   System.out.println("\nSum of Array is: "+sum);
 }
}