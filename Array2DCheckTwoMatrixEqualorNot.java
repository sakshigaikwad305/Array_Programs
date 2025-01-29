//Write a program in java to accept two matrices and check whether they are equal

import java.util.*;
public class Array2DCheckTwoMatrixEqualorNot
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter Size row and column of Square Matrix:");
    int n=xyz.nextInt();
    int[][]a=new int[n][n];
    int[][]b=new int[n][n];

    System.out.println("Enter elements in 1st Array:");
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            a[i][j]=xyz.nextInt();   
        }
     }

    System.out.println("Enter elements in 2nd Array:");
    for(int i=0;i<b.length;i++){
        for(int j=0;j<b.length;j++){
            b[i][j]=xyz.nextInt();   
        }
     }

    boolean flag=true;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
              if(a[i][j]!=b[i][j]){
                   flag=false; 
                   break;
              } 
        }
     }

   String str=flag?"The matrix are Equal !!":"The matrix are not equal!!";
   System.out.println(str);
  }
}
    