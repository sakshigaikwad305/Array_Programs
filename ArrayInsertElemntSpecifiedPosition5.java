import java.util.*;
public class ArrayInsertElemntSpecifiedPosition5
{
 public static void main(String x[]) 
 {
   Scanner xyz=new Scanner(System.in);
   int[]a=new int[5];
   int i;
   System.out.println("Enter elemnts in Array:");
   for(i=0;i<a.length-1;i++)
     {
       a[i]=xyz.nextInt();
     }
   System.out.println("Enter the Index value: ");
   int index=xyz.nextInt();
   System.out.println("Enter value which want to Store: ");
   int value=xyz.nextInt();
   for(i=a.length-1;i>0;i--)
    {
       a[i]=a[i-1];
    }
   a[index]=value;
   for(i=0;i<a.length;i++)
     {
       System.out.printf("%d\t",a[i]);
     }
 }
}