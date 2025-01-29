import java.util.*;
public class ArrayAntiClockwiseNTimes   //left Rotation 
{                                       //1 2 3 4 5 ==>1
 public static void main(String x[])    //2 3 4 5 1
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
   for(int k=0;k<n;k++)
   {
      temp=a[0];
      for(i=0;i<a.length-1;i++)
       {
         a[i]=a[i+1];
       }
      a[a.length-1]=temp;
   }
   for(i=0;i<a.length;i++)
   {
       System.out.printf("%d\t",a[i]);
   }
    
 }
}