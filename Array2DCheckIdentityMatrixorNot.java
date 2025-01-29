//Write a program in java to check whether a given matrix is an identity matrix.

import java.util.*;
public class Array2DCheckIdentityMatrixorNot
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter Size row and column of Square Matrix:");
    int n=xyz.nextInt();
    int[][]a=new int[n][n];

    System.out.println("Enter elements in Array:");
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            a[i][j]=xyz.nextInt();   
        }
     }
    boolean flag=true;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
             if((i==j&&a[i][j]!=1)||(i!=j&&a[i][j]!=0)){
                   flag=false;
                 }
             }
           }
  
   String str=flag?"The matrix is Identity Matrix !!":"The matrix is not Identity Matrix!!";
   System.out.println(str);
                   
   }
 }

   