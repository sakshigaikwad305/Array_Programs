/*
Write a java to remove element in specific index.
*/
import java.util.*;
public class Array08
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

		for(int i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];  //delete specific index element
		}
		
		
		//print resultant array
		System.out.println("Print resultant array after deleting specific index:");
		for(int i=0;i<a.length-1;i++)  //after deleting size will reduce
		{
			System.out.print(a[i]+" ");
		}
	}
}