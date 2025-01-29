import java.util.*;
public class ArraySmallest2ndSmall
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int a[],temp,i,j;
    a = new int[6];
    System.out.println("Enter elements in Array:");
    for(i=0;i<a.length;i++)
    {
       a[i]=xyz.nextInt();
    }
    //"Array Ascending:"
    for(i=0;i<a.length;i++)
    {
       temp=a[i];
       for(j=i+1;j<a.length;j++)
        {
          if(a[i]>a[j]){
              //temp=a[i];
              a[i]=a[j];
              a[j]=temp;
             }
        }   
    }
    System.out.println("The Smallest element is: "+a[0]+"\nSecond Smallest element is: "+a[1]);
 }
}