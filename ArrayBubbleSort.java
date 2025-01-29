import java.util.*;
public class ArrayBubbleSort
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int a[];
    a=new int[6];
    int i,temp;
    System.out.println("Enter numbers in Array:");
    for(i=0;i<a.length;i++)
      {
          a[i]=xyz.nextInt();
      }
    System.out.println("Before Ascending Order:");
    for(i=0;i<a.length;i++)
     {
       System.out.printf("%d\t",a[i]);  
     }
    System.out.println("\nAfter Ascending Order:");
    for(i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
         {
            if(a[i]>a[j])
              {
               temp=a[i];
               a[i]=a[j];             
               a[j]=temp;
              }
         }
    }

    for(i=0;i<a.length;i++)
     {
        System.out.printf("%d\t",a[i]);
     }
 }
}