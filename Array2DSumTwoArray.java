//Write a program in C for addition of two Matrices of same size.

import java.util.*;
public class Array2DSumTwoArray 
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[][]=new int[2][2];
   int b[][]=new int[2][2];
   int c[][]=new int[2][2];
   int i,j;

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
  
   System.out.println("Sum Of Two 2D Arrays Are:");
   for(i=0;i<c.length;i++){
     for(j=0;j<c.length;j++){
          c[i][j]=a[i][j]+b[i][j];
          System.out.printf("%d ",c[i][j]);
        }  
      System.out.println();
    }
  }
}

  

   