/*
2. Write program to create array of size 5 and input search key value and search value in array?
*/

import java.util.*;
public class Array02
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];//initialize array
		
		//take input in array
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		//input search key
		System.out.println("Enter search key : ");
		int skey=s.nextInt();
		
		//search value logic if found then print not find then also print
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==skey)
			{
				System.out.println("Search value is found in array "+a[i]);
				flag=true;
			}
		}
		if(!flag)
		{
			System.out.println("Search value is not found in array ");
		}
	}
}
		
/*
C:\Program Files\Java\jdk1.8.0_202\bin>java Array02
Enter values in array:
70
30
11
56
30
Enter search key :
8
Search value is not found in array 8

C:\Program Files\Java\jdk1.8.0_202\bin>javac Array02.java

C:\Program Files\Java\jdk1.8.0_202\bin>java Array02
Enter values in array:
56
11
30
70
8
Enter search key :
70
Search value is found in array 70

C:\Program Files\Java\jdk1.8.0_202\bin>
*/		