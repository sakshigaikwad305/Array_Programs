/*
Write a java program to rotate array in specific index.
Original Array: [1, 2, 3, 4, 5, 6] index=2
Rotated Array: [3, 4, 5, 6, 1, 2]
*/


import java.util.*;
public class Array09
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=m.nextInt();
		}
		
		int b[]=new int[5];
		int k=0;
		System.out.println("Enter index to rotate array:");
		int index=m.nextInt();
		
		for(int i=index;i<a.length;i++)
		{
			b[k]=a[i];
			k++;
		}
		for(int i=0;i<index;i++)
		{
			b[k]=a[i];
			k++;
		}
		System.out.println("Array after rotation:");
		for(int arr:b)
		{
			System.out.print(arr+"\t");
		}
	}
}