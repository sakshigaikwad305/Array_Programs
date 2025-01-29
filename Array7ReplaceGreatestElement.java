/*Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers.
There is no element next to the last element, therefore replace it with -1. 

Input- Original Array 
[45, 20, 100, 23, -5, 2, -6]
Output- The modified array:
[100, 100, 23, 2, 2, -6, -1]
*/

import java.util.*;
public class Array7ReplaceGreatestElement
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int [] a= new int[7];
   int i,j;
   //boolean flag=false;
   System.out.println("Enter Elements in Array:");
   for(i=0;i<a.length;i++)
     {
         a[i]=xyz.nextInt();
     }
   System.out.println("Display elements:");
   for(i=0;i<a.length;i++)
    {
       System.out.printf("%d\t",a[i]); 
    } 

  //logic

   for(i=0;i<a.length;i++)
     {
       for(j=i+1;j<a.length-1;j++)
          {
              if(a[i]<a[j])
                 {
                    a[i]=a[j];
                    break;
                    //flag=true;
                 }
               else{
                   a[i]=a[i];
                   //flag=false;
                 }
                  
          }
     }
    a[a.length-1]=-1;
   System.out.println("\nModified Array:");
   for(i=0;i<a.length;i++)
     {
        System.out.printf("%d\t",a[i]);
     }  
 }
}
