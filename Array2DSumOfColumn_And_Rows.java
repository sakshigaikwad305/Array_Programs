//Write a program in java to find sum of rows an columns of a Matrix.

import java.util.*;
public class Array2DSumOfColumn_And_Rows
{
 public static void main(String x[])
 {
   Scanner xyz=new Scanner(System.in);
   int a[][]=new int[2][2];
   int i,j,rowsum=0,colsum=0;

   System.out.println("Enter Elements in Array:");
   for(i=0;i<a.length;i++){
     for(j=0;j<a.length;j++){
          a[i][j]=xyz.nextInt();
         }
      }

   for(i=0;i<a.length;i++){
     for(j=0;j<a.length;j++){
          rowsum=rowsum+a[i][j];
          System.out.printf("%d\t",a[i][j]);
        }
       System.out.printf("= %d\n",rowsum);
       rowsum=0;
      }

  for(j=0;j<a.length;j++){
     for(i=0;i<a.length;i++){
          colsum=colsum+a[i][j];
          //System.out.printf("%d\t",a[i][j]);
        }
       System.out.printf("%d\t",colsum);
       colsum=0;
      }
  }
}
    
