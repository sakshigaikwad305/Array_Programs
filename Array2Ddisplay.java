//Write a program in java for a 2D array of size 3x3 and print the matrix?
import java.util.*;
public class Array2Ddisplay 
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[][]=new int[3][3];
   int i,j;
   System.out.println("Enter Elements in Array:");
   for(i=0;i<a.length;i++){
     for(j=0;j<a.length;j++){
          a[i][j]=xyz.nextInt();
         }
      }
   System.out.println("Display 2D Array:");
   for(i=0;i<a.length;i++){
     for(j=0;j<a.length;j++){
          System.out.printf("%d\t",a[i][j]);
         }
        System.out.println();
      }

 }
}