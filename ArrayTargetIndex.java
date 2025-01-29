import java.util.*;
public class ArrayTargetIndex
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int a[],i,j,flag=0;
    a=new int[6];
    System.out.println("Enter elements in Array:");
    for(i=0;i<a.length;i++)
     {
       a[i]=xyz.nextInt();
     }
    System.out.println("Enter Target value:");
    int target=xyz.nextInt();
    for(i=0;i<a.length;i++)
    {
      for(j=i+1;j<a.length;j++)
        {
            if(a[i]+a[j]==target)
             {
                flag=1;
                System.out.println("The index values are: "i+"  "+j);         
             }
        }
    }
   if(flag==0){
          System.out.println("No target value is found!!");
       }
 }
}