import java.util.*;
public class Array
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[];
   int i,temp;
   a=new int[5];
   System.out.println("Enter values in Array:");
   for(i=0;i<a.length;i++)
    {
       a[i]=xyz.nextInt();
    } 
   System.out.println("Display Array:");
   for(i=0;i<a.length;i++)
    {
       System.out.println(a[i]);
    } 

 }
}