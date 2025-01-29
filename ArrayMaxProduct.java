/*Write a Java program to find the maximum product of two integers in a given array of integers.  
Example:
Input :
nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
Output:
Pair is (7, 8), Maximum Product: 56
*/

import java.util.*;
public class ArrayMaxProduct
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int[] a=new int[8];
   int i,j,p=1,max=0,z=0,y=0;
   System.out.println("Enter numbers in Array:");
   for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    } 
   System.out.println("Display Array:");
   for(i=0;i<a.length;i++)
   {
     System.out.printf("%d\t",a[i]);
   }
   
   //logic
   for(i=0;i<a.length;i++)
    {
      for(j=i+1;j<a.length-1;j++)
        { 
          p=a[i]*a[j];
          if(p>max){
            max=p;
            z=a[i];
            y=a[j];
           }
        }
    }
   System.out.println("\nPair is("+z+","+y+")Product= "+max);
  
 }
}