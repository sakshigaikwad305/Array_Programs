//Write a program in java to print or display upper triangular matrix

import java.util.*;
public class Array2DUpperTriangularMatrix
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    int[][]a=new int[3][3];
    System.out.println("Enter elements in Array:");
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            a[i][j]=xyz.nextInt();   
        }
     }
    
   System.out.println("Display Array :");
   for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            System.out.printf("%d\t",a[i][j]);   
        }
       System.out.println();
     }
   
   System.out.println("Display Array Upper Triangular:");
   for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
           if(j<=i){
                System.out.printf("%d\t",a[i][j]); 
               }
             else{
               System.out.printf("0\t");
             }  
        }
       System.out.println();
     }
     
 }
}