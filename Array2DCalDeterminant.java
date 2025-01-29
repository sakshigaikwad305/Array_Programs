//Write a program in java to calculate determinant of a 2*2 and 3*3 matrix.

import java.util.*;
public class Array2DCalDeterminant
{
 public static void main(String xy[])
 {
    Scanner xyz=new Scanner(System.in);
    int[][]a=new int[3][3];
    System.out.println("Enter elements in Array:");
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            a[i][j]=xyz.nextInt();   
        }
     }

    System.out.println("Display Array:");
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.printf("%d\t",a[i][j]);  
        }
       System.out.println();
     }
   
   //determinant is always positive i,e.|a|
   //for 2*2 matrix
   //int determinant=a[0][0]*a[1][1]-a[0][1]*a[1][0]; 
   //for 3*3 matrix
   
   int x=(a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1]));
   int y=(a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0]));
   int z=(a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]));

    int determinant=x-y+z;

   System.out.println("The determinant of the matrix is: "+determinant);
   }
}
    