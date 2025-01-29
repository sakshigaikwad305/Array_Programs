import java.util.*;
public class ArrayClockwiseNTimes      //right rotation
{                                      //1 2 3 4 5==>1
 public static void main(String x[])   //5 1 2 3 4
 {
   Scanner xyz=new Scanner(System.in);
   int a[],i,temp;
   a=new int[5];
   System.out.println("Enter elements in Array:");
   for(i=0;i<a.length;i++)
   {
       a[i]=xyz.nextInt();
   }
   System.out.println("Enter rotation time:");
   int n=xyz.nextInt();
   for(int k=1;k<=n;k++)
   {
      temp=a[a.length-1];
      for(i=a.length-1;i>0;i--)
       {
         a[i]=a[i-1];
       }
      a[0]=temp;
   }
   for(i=0;i<a.length;i++)
   {
       System.out.printf("%d\t",a[i]);
   }
    
 }
}