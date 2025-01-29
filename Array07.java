/*
Write a java program to rotate array from specific index.
*/


import java.util.*;
public class Array07
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
		
		//take index from user 
		System.out.println("Enter index:");
		int index=s.nextInt();
		
		int temp=a[index];//store index value
		for(int i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];  //rotate array
		}
		a[a.length-1]=temp;  //print index value in last position
		
		//print resultant array
		System.out.println("Print resultant array after rotate specific index:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}