/*
 Write a java program to copy one array to another array.
*/

import java.util.*;
public class Array06
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		/*
		int a[]=new int[5];//initialize the array
		
		//take input in array
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		//copy the array in another array
		int copy[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			copy[i]=a[i];
		}
		
		//print copied array
		System.out.println("The array after copy :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(copy[i]+" ");
		}
		*/
		int a[]=new int[5];
		int b[]=new int[5];
		
		int i,j=0;
		
		System.out.println("Enter values in array:");
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			b[j]=a[i];
			j++;
		}
		
		System.out.println("Copied array is:");
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"\t");
		}
		
	}
}