/*
1. Write program to create array of size and arrange all values in ascending & descending order?
*/

import java.util.*;
public class Array01
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
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
		System.out.println("Ascending Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\n\nDescending Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/*

C:\Program Files\Java\jdk1.8.0_202\bin>java Array01
Enter values in array:
79
23
12
46
32
Ascending Array:
12 23 32 46 79 

Descending Array:
79 46 32 23 12
C:\Program Files\Java\jdk1.8.0_202\bin>
*/