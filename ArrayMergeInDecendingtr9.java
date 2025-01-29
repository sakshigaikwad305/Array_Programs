import java.util.*;
public class ArrayMergeInDecendingtr9
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[]=new int[3];
   int b[]=new int[3];
   int c[]=new int[a.length+b.length];
   int i,j,n=0;

   System.out.println("Enter elements in First Array:");
   for(i=0;i<a.length;i++){
       a[i]=xyz.nextInt();
       c[n]=a[i];
       n++;
      }
   
   System.out.println("Enter elements in Second Array:");
   for(i=0;i<b.length;i++){
       b[i]=xyz.nextInt();
       c[n]=b[i];
       n++;
      } 
 
   for(i=0;i<c.length;i++){
       for(j=i+1;j<c.length;j++){
           if(c[i]<c[j]){
               int temp=c[i];
               c[i]=c[j];
               c[j]=temp;
             }
          }
       }
   
   System.out.println("Merged Array in Descending Order:");
   for(i=0;i<c.length;i++){
        System.out.printf("%d\t",c[i]);
      }

 }
}