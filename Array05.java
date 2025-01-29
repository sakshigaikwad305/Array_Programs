/*
1. Write a java program to find missing element in array.
*/

import java.util.*;
public class Array05
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];//initialize the array
		
		//take input in array
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		//ascending order array
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//finding missing elements
		System.out.println("Missing elements of given array is: ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.print(j+" ");
			}	
		}
	}
}