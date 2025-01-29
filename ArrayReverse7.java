import java.util.*;
public class ArrayReverse7
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int[]a=new int[5];
    int i,mid,end,temp;
    System.out.println("Enter elements in Array:");
    for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }
    mid=a.length/2;
    end=a.length-1;
    for(i=0;i<mid;i++,end--){
         temp=a[i];
         a[i]=a[end];
         a[end]=temp;
      }

   System.out.println("Array After reverse is:");
   for(i=0;i<a.length;i++){
       System.out.printf("%d ",a[i]);
      }
                          
    
 }
}
