/*Write a Java program to calculate the largest gap between sorted elements of an array of integers.  
Example:
Original array: [23, -2, 45, 38, 12, 4, 6]
Largest gap between sorted elements of the said array: 15
*/

import java.util.*;
public class ArrayLargestGap
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int[]a=new int[7];
    int i,j,gap,Maxgap=0,temp;
    System.out.println("Enter Elements in Array:");
    for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    }
    for(i=0;i<a.length;i++)
     {
       for(j=i+1;j<a.length;j++)
        { 
          if(a[i]>a[j])
           {
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;
          }
        }
     } 
     for(i=0;i<a.length-1;i++)
       {
         gap=a[i+1]-a[i];
         if(gap>Maxgap){
            Maxgap=gap;
           }  
       }
     System.out.print("The Largest Gap between sorted elements is: "+Maxgap);
 }
}