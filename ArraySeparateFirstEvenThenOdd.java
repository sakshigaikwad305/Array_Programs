import java.util.*;
public class ArraySeparateFirstEvenThenOdd
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[],i,b[];
   a=new int[6];
   b=new int[6];
   System.out.println("Enter values in Array:");
   for(i=0;i<a.length;i++)
    { 
       a[i]=xyz.nextInt();    
    }
     int even=0;
     int odd=a.length-1;
    for(i=0;i<a.length;i++)
    {
       if(a[i]%2==0){
          b[even]=a[i];
          even++;
        }
       else{
         b[odd]=a[i];
         odd--;
        }
     }
    System.out.println("The array:");
    for(i=0;i<b.length;i++)
    {
      System.out.printf("%d\t",b[i]);
    } 
 }
}