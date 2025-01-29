import java.util.*;
public class ArraySecondLargestElement
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int[]a=new int[6];
   int i,largest1=0,largest2=0;
   System.out.println("Enter elements in Array:");
   for(i=0;i<a.length;i++){
      a[i]=xyz.nextInt();
     }
  
   //largest1=a[0];
   for(i=0;i<a.length;i++){
        if (a[i] > largest1) {
            largest1 = a[i];
        }
    }
   //largest2=a[0];
   for(i=0;i<a.length;i++){
        if(a[i]>largest2&&a[i]<largest1)
            largest2=a[i];
    }
    System.out.printf("First and second largest number is %d and %d ", largest1, largest2);
 }
}