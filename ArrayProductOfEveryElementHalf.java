/*Write a Java program to replace each element of the array with the product of every other element in a given array of integers.  
Example:
Input :
nums1 = { 1, 2, 3, 4, 5, 6, 7} skip one one number a[i]
Output:
Array with product of every other element:
[5040, 2520, 1680, 1260, 1008, 840, 720]

Input :
nums2 = {0, 1, 2, 3, 4, 5, 6, 7}
Array with product of every other element:
[5040, 0, 0, 0, 0, 0, 0, 0]

*/

import java.util.*;
public class ArrayProductOfEveryElementHalf
{ 
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int[]a=new int[7];
    int[]b=new int[a.length];
    int i,p,j;
    System.out.println("Enter elements in Array:");
    for(i=0;i<a.length;i++)
      {
          a[i]=xyz.nextInt();
      }
   for(i=0;i<a.length;i++)
      {  p=1;
         for(j=0;j<a.length;j++)
          {
              if(i==j){
                continue;
              }
             p=p*a[j];
          }
         b[i]=p;
      }
   for(i=0;i<a.length;i++)
      {
          System.out.printf("%d\t",b[i]);
      }

 }
}
