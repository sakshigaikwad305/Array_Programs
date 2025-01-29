import java.util.*;
public class ArrayMaxMin3
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int[]a=new int[5];
   int i,max,min;
   System.out.println("Enter elements in Array:");
   for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    }
   max=a[0];
   min=a[0];
   for(i=0;i<a.length;i++)
   {
      if(max<a[i]){
         max=a[i];
       }
     if(min>a[i]){
       min=a[i];
      }
   }
  System.out.println("Minimum element in Array is: "+min+"\nMaximum elemnt in Array is: "+max);
 }
}
