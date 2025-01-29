import java.util.*;
public class ArrayMissingElements6
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int[]a=new int[6];
    int i,j,temp;
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
    System.out.println("Array in Ascending Order:");
    for(i=0;i<a.length;i++){
       System.out.printf("%d ",a[i]);
         }
    System.out.println("\nMissing Elements are:");
    for(i=0;i<a.length-1;i++){
       for(j=a[i]+1;j<a[i+1];j++){
             System.out.printf("%d ",j);
            }
        }
      
      
     
 }
}