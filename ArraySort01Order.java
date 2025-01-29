/*Example:
Input :
b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
Output:
After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
*/

import java.util.*;
public class ArraySort01Order
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int [] a=new int[10];
   int [] b=new int[10];
   int i;
   System.out.println("Enter elements in Array:");
   for(i=0;i<a.length;i++)
    {
       a[i]=xyz.nextInt();
    }
   System.out.println("Display Elements:");
   for(i=0;i<a.length;i++)
    {
      System.out.printf("%d\t",a[i]);
    }
    System.out.println("\nAfter Sorting:");
    int no0=0;
    int no1=a.length-1;
    for(i=0;i<a.length;i++)
     {
         if(a[i]==0)
            {
               b[no0]=a[i];
               no0++;
            } 
          else{
              b[no1]=a[i];
              no1--;
            }           
     }
   
    for(i=0;i<a.length;i++)
     {
       System.out.printf("%d\t",b[i]);
     }
   
 }
}