//Write a program in C to rotate an array by N positions ?

import java.util.*;
public class ArrayRotateFrom_N_Position
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int[]a=new int[6];
   int[]temp=new int[6];
   int k=0,i;
   System.out.println("Enter elements in Array:");
   for(i=0;i<a.length;i++){
       a[i]=xyz.nextInt();
    }
    System.out.println("Enter index to rotate Array to index positions:");
    int index=xyz.nextInt();
 
    for(i=index;i<a.length;i++){
        temp[k]=a[i];
         k++;
       }
    for(i=0;i<index;i++){
        temp[k]=a[i];
         k++;
      }

   for(i=0;i<k;i++){
      System.out.printf("%d ",temp[i]);
    } 
 }
}