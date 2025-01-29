//Write a program in java to find the smallest missing element from a sorted array?


import java.util.*;
public class ArraySmallestMissingElement
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int a[]=new int[4];
    int i,j,temp,smallestMissing=0;
    System.out.println("Enter elements in Array:");
    for(i=0;i<a.length;i++){
        a[i]=xyz.nextInt();
       }
    for(i=0;i<a.length;i++){
       for(j=i+1;j<a.length;j++){
             if(a[i]>a[j]){
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;
           }
          }
        }
    System.out.println("Missing Elements:");
    for(i=0;i<a.length-1;i++){
      for(j=a[i]+1;j<a[i+1];j++){
            int small=j;
            System.out.printf("%d ",j);                   
        }
     }
 }
}