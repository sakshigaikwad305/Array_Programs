import java.util.*;
public class ArrayDeleteDesiredElement
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int[]a=new int[5];
    System.out.println("Enter elements in Array:");
    for(int i=0;i<a.length;i++){
       a[i]=xyz.nextInt();
      }
   System.out.println("Enter value to delete:");
   int value=xyz.nextInt();
   
   for(int i=0;i<a.length;i++){
       if(a[i]==value){
          for(int j=i;j<a.length-1;j++){
             a[j]=a[j+1];
        }
        break;
       }
     }
  System.out.println("Display Array After Delete:");
  for(int i=0;i<a.length-1;i++){
       System.out.printf("%d\t",a[i]);
     }
 }
}