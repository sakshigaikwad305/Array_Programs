import java.util.*;
public class ArrayAddElementInSpecificIndex
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
	int a[];
	a=new int[6];
    System.out.println("Enter elemet in Array:");
    for(int i=0;i<a.length-1;i++)
	{
      a[i]=xyz.nextInt();
    }
    System.out.println("Enter index:");
	int index=xyz.nextInt();
    System.out.println("Enter value to insert:");
    int value=xyz.nextInt();
    for(int i=a.length-1;i>index;i--)
    {
       	a[i]=a[i-1];
    }
    a[index]=value;
	for(int i=0;i<a.length;i++)
	{
      System.out.printf("%d\t",a[i]);
    }
  }
}  