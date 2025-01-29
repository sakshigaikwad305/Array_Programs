/*Write a java programs to print all primes smaller than or equal to n using Sieve of Eratosthenes algorithm
Input – n=10
Output- 2 3 5 7 
Input- n=20
Output- 2 3 5 7 11 13 17 19
*/

import java.util.*;
public class ArrayPrimePrint
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   System.out.println("Enter Limit:");
   int n=xyz.nextInt();
   int i,j;
   int []a=new int[n+1];
   for(i=0;i<n;i++)
    {
      a[i]=i+1;
     }
   for(i=1;i<=n;i++)
    {
      boolean flag=false;
      for(j=1;j<=i/2;j++)
       {
          if(a[i]%a[j]==0)
           {
            flag=true;
            break;
           }
       }
      if(!flag){
         System.out.println(a[i]+"--->"+i);
        }       
    }
       
 }
}