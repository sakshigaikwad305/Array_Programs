//Write a program in java for multiplication of two square Matrices

import java.util.*;
public class Array2DMultiplicationTwoSquareMatrix 
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[][]=new int[2][2];
   int b[][]=new int[2][2];
   int c[][]=new int[2][2];
   int i,j,k;

   System.out.println("Enter Elements in 1st Array:");
   for(i=0;i<a.length;i++){
     for(j=0;j<a.length;j++){
          a[i][j]=xyz.nextInt();
         }
      }
   System.out.println("Enter Elements in 2nd Array:");
   for(i=0;i<b.length;i++){
     for(j=0;j<b.length;j++){
          b[i][j]=xyz.nextInt();
         }
      }

   for(i=0;i<c.length;i++){
     for(j=0;j<c.length;j++){
        for(k=0;k<c.length;k++){ 
            c[i][j]+=a[i][k]*b[k][j];
          }
        }  
      }
 
  System.out.println("After Multiplication:");
  for(i=0;i<c.length;i++){
     for(j=0;j<c.length;j++){
           System.out.printf("%d ",c[i][j]);
         }
        System.out.println();
      } 
  }
}