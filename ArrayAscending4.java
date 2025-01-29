import java.util.*;
public class ArrayAscending4
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int[]a=new int[5];
    int i,j,temp;
    System.out.println("Enter elements in Array:");
    for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }
   for(i=0;i<a.length;i++)
    {
      for(j=i+1;j<a.length;j++)
        {
           if(a[i]>a[j]){
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
          }
        }
    }
   System.out.print("Display Elements in Ascending Order:\n");
   for(i=0;i<a.length;i++)
     {
       System.out.printf("%d\t",a[i]);
      }
 }
}