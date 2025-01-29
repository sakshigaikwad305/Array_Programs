import java.util.*;
public class ArrayReverse
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int a[],i,temp,end,mid;
    a=new int[6];
    System.out.println("Enter elements in Array:");
    for(i=0;i<a.length;i++)
    {
       a[i]=xyz.nextInt();
    }
    System.out.println("Display Array Before Reverse:");
    for(i=0;i<a.length;i++)
     {
        System.out.printf("%d\t",a[i]);
     }
   System.out.println("\nArray After Reverse:");
   end=a.length-1;
   mid=a.length/2;
      
   for(i=0;i<mid;i++,end--)
      {
         temp=a[i];
         a[i]=a[end];
         a[end]=temp;
      } 
   for(i=0;i<a.length;i++)
     {
        System.out.printf("%d\t",a[i]);
     }
   
 }
}