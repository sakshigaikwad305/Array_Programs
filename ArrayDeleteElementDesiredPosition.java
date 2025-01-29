import java.util.*;
public class ArrayDeleteElementDesiredPosition
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int[]a=new int[5];
    System.out.println("Enter elements in Array:");
    for(int i=0;i<a.length;i++){
       a[i]=xyz.nextInt();
      }
   System.out.println("Enter index where to delete:");
   int index=xyz.nextInt();

   for(int i=index;i<a.length-1;i++){
       a[i]=a[i+1];
     }

  System.out.println("Display Array After Delete:");
  for(int i=0;i<a.length-1;i++){
       System.out.printf("%d\t",a[i]);
     }
 }
}