/*Write a Java program to shuffle a given array of integers. 
Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]
*/

import java.util.*;
public class ArrayShuffle10
{
 public static void main(String x[])
 {
    Random r= new Random();
    Scanner xyz=new Scanner(System.in);
    int[]a=new int [6]; 
    int i,j;
    System.out.println("Enter elements:");
    for(i=0;i<a.length;i++)
     {
         a[i]=xyz.nextInt();
     }
    for(i=a.length-1;i>=0;i--)
    {
       j=r.nextInt(i+1); // OR (int)(Math.random()*(i+1))
       int temp=a[i];
       a[i]=a[j];
       a[j]=temp;
    }
     
    System.out.println("Array After Suffle:");
    for(i=0;i<a.length;i++)
     {
         System.out.println(a[i]);
     }
 }
}
