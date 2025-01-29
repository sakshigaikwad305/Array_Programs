import java.util.*;
public class ArrayFindSumPair
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int[]a=new int[6];
   System.out.println("Enter elements in Array:");
   for(int i=0;i<a.length;i++){
      a[i]=xyz.nextInt();
     } 
  System.out.println("Enter Sum:");
  int sum=xyz.nextInt();
  for(int i=0;i<a.length;i++){
     for(int j=i+1;j<a.length;j++){
          if(a[i]+a[j]==sum){
               System.out.println("Pair : ("+i+","+j+")");
              }
            }
         }
  
 }
}