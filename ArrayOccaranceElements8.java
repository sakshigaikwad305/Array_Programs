import java.util.*;
public class ArrayOccaranceElements8
{
 public static void main(String x[]) 
 {
    Scanner xyz=new Scanner(System.in);
    int[]a=new int[11];
    int i,j,temp,count=0;;
    System.out.println("Enter elements in Array:");
    for(i=0;i<a.length-1;i++){
       a[i]=xyz.nextInt();
      }
  
    for(i=0;i<a.length-1;i++)
    {
      for(j=i+1;j<a.length-1;j++)
        {
           if(a[i]>a[j]){
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
          }
        }
     }
   System.out.println("The Occurances Are:");
   for(i=0;i<a.length-1;i++)
   {
     if(a[i]==a[i+1]){    //a[11]=a[11+1]=a[12] it goes to zero index 
          count++;       //in c it will break
       }
     else{
         count++;
         System.out.printf("%d---->%d\n",a[i],count);
         count=0;
       }
   }
 }
}