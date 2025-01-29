import java.util.*;
public class ArrayMedian
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int a[],b[],c[],i,k=0;
    float sum=0;
    a=new int[2];
    b=new int[4];
    c=new int[6];
    System.out.println("Enter values in First Array:");
    for(i=0;i<a.length;i++)
    {
       a[i]=xyz.nextInt();
       c[k]=a[i];
       k++;
    }
    System.out.println("Enter values in array:");
    for(i=0;i<b.length;i++)
    {
        b[i]=xyz.nextInt();
        c[k]=b[i];
        k++;
    }
    System.out.println("Display Merged Array:");
    for(i=0;i<c.length;i++)
    {
       System.out.printf("%d\t",c[i]);
       sum=sum+c[i];
    }
    float median = sum/c.length;
   System.out.println("\nThe median of merged array: "+median);
 }
}