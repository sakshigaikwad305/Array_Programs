import java.util.*;
public class ArrayMajorityElementsInArray
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int[]a=new int[8];
    int i;
    System.out.println("Enter elements Array:");
    for(i=0;i<a.length;i++){
       a[i]=xyz.nextInt();
      }

    int MaxCount=0;
    int majorityElement=-1;
    int count;
    for(i=0;i<a.length;i++){
       count=0;
       for(int j=0;j<a.length;j++){
          if(a[i]==a[j]){
           count++;
         }
        }
    //System.out.println(count);
        if(count>MaxCount){
          MaxCount=count;
          majorityElement=a[i];  
        }
       }
  
         if(MaxCount>(a.length)/2){
         System.out.println("Majority Elements is Found!! = "+majorityElement);
        }
     else{
        System.out.println("Majority Elements is Not Fount!!");
      }
   
 }
}