import java.util.*;
public class ArrayFindPrimeNumber
{
 public static void main(String x[])
 {
    int i,a[],j,temp;
	a=new int[5];
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter elements in Array:");
	for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    }
	
	System.out.println("Prime numbers in array:");
    for(i=0;i<a.length;i++)
    {
	  boolean flag=true;
      for(j=2;j<=a[i]/2;j++)
	  {
        if(a[i]%j==0)
		{
            flag=false;
        }
	  }
	  if(a[i]>1&&flag){
		System.out.printf("%d\n",a[i]);
	  }
    }	  
 }       
} 