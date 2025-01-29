//Write a program in java to find transpose of a given matrix.

import java.util.*;
public class Array2DTransposeOfMatrix 
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[][]=new int[2][2];
   int Trap[][]=new int[2][2];
   int i,j;

   System.out.println("Enter Elements in Array:");
   for(i=0;i<a.length;i++){
     for(j=0;j<a.length;j++){
          a[i][j]=xyz.nextInt();
         }
      }

   System.out.println("Display Transpose of Array:");
   for(i=0;i<Trap.length;i++){
     for(j=0;j<Trap.length;j++){
          Trap[i][j]=a[j][i];
          System.out.printf("%d ",Trap[i][j]);
         }
        System.out.println();
      }
   }
}