import java.util.*;
public class ArraySecondSmallestElement
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int[]a=new int[6];
   int i,smallest1,smallest2;
   System.out.println("Enter elements in Array:");
   for(i=0;i<a.length;i++){
      a[i]=xyz.nextInt();
     }
  
   smallest1=a[0];
   for(i=0;i<a.length;i++){
        if (a[i]<smallest1) {
            smallest1 = a[i];
        }
    }
   smallest2=a[1];
   for(i=0;i<a.length;i++){
        if(a[i]<smallest2&&a[i]>smallest1){
            smallest2=a[i];
          }
    }
    System.out.printf("First and second smallest number is %d and %d ", smallest1, smallest2);
 }
}