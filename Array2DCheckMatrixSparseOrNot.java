//Write a program in java to accept a matrix and determine whether it is a sparse matrix.
//There are many more  number of zeros in the matrix more than non-zero numbers.

import java.util.*;
public class Array2DCheckMatrixSparseOrNot
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter Size row and column of Square Matrix:");
    int n=xyz.nextInt();
    int[][]a=new int[n][n];
    int count=0;

    System.out.println("Enter elements in Array:");
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            a[i][j]=xyz.nextInt();   
        }
     }
    
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(a[i][j]==0){
                  count++;
              }   
          }
       }
   
      if(count>(n*n)/2){
            System.out.println("The given matrix is Sparse Matrix!!");
       }
       else{
          System.out.println("The given matrix is Not Sparse Matrix!!");
       }
   }
}
