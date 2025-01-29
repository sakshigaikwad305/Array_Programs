//Write a program in java to find sum of Left diagonals of a matrix

import java.util.*;
public class Array2DSumOfLeftDiagonal
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[][]=new int[3][3];
   int i,j,sum=0;

   System.out.println("Enter Elements in Array:");
   for(i=0;i<a.length;i++){
     for(j=0;j<a.length;j++){
          a[i][j]=xyz.nextInt();
         }
      }

   for(i=0;i<a.length;i++){
             sum=sum+a[i][i];
        }
    System.out.println("Sum of Left Digonal of Matrix: "+sum);
   }
}

