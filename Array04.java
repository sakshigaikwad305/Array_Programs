/*
4. Write program to create array of size 5 and reverse it?
*/

import java.util.*;
public class Array04
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];//initialize array
		
		//input in array
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		int mid=a.length/2;  //calculate mid position
		int end=a.length-1;  //calculate end position
		
		//logic for reverse the array
		for(int i=0;i<mid;i++,end--)
		{
			int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
		}
		
		
		//print the reverse array
		System.out.println("Array after reverse values:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
/*
C:\Program Files\Java\jdk1.8.0_202\bin>java Array04
Enter values in array:
10
20
30
40
50
Array after reverse values:
50 40 30 20 10
C:\Program Files\Java\jdk1.8.0_202\bin>
*/