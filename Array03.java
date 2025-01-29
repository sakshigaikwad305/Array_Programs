/*
3. Write program to create array of size 10 and find occurrence of every element in array? 
*/

import java.util.*;
public class Array03
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[11];//initialize array with increased size because we want to calculate occurrence and save last space blank
		
		//take input in arry
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		
		//ascending array in sequence
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//calculate the occurrence of element one by one
		System.out.println("The occurrence of elements in array : ");
		int count=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			else{
				System.out.println(a[i]+"--------------> "+count);
				count=1;
			}
		}
	}
}

/*
C:\Program Files\Java\jdk1.8.0_202\bin>javac Array03.java

C:\Program Files\Java\jdk1.8.0_202\bin>java Array03
Enter values in array:
10
20
30
40
10
10
20
20
20
50
The occurrence of elements in array :
10--------------> 3
20--------------> 4
30--------------> 1
40--------------> 1
50--------------> 1
*/