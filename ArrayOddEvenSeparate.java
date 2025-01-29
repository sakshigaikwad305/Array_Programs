import java.util.*;
public class ArrayOddEvenSeparate
{
 public static void main(String x[]) 
 {
   Scanner xyz=new Scanner(System.in);
   int[]a=new int[10];
   int[]even=new int[a.length];
   int[]odd=new int[a.length];

   System.out.println("Enter elements in Array:");
   for(int i=0;i<a.length;i++){
     a[i]=xyz.nextInt();
   }

   System.out.println("Display Array:");
   for(int i=0;i<a.length;i++){
     System.out.printf("%d\t",a[i]);
   }

   int j=0;
   int k=0;
   for(int i=0;i<a.length;i++){
     if(a[i]%2==0){
            even[k]=a[i];
            k++;
          }
      else{
           odd[j]=a[i];
           j++;
         }
      }
   
   System.out.println("\nEven Array:");
   for(int i=0;i<k;i++){
         System.out.printf("%d\t",even[i]);
        }

   System.out.println("\nOdd Array:");
   for(int i=0;i<j;i++){
         System.out.printf("%d\t",odd[i]);
        }
 }
}