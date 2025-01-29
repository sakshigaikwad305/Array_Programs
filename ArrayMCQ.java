/*public class ArrayMCQ
{
public static void main(String args[])
{
int arr[][] = new int[3][];
arr[0] = new int[1];
arr[1] = new int[2];
arr[2] = new int[3];
int sum = 0;
for (int i = 0; i < 3; ++i)
for (int j = 0; j < i + 1; ++j)
arr[i][j] = j + 1;
for (int i = 0; i < 3; ++i)
for (int j = 0; j < i + 1; ++j)
sum += arr[i][j];
System.out.print(sum);
}
}
*/

/*public class ArrayMCQ
{
public static void main(String args[])
{
int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
int sum = 0;
for (int i = 0; i < 3; ++i)
for (int j = 0; j <  3 ; ++j)
sum = sum + array_variable[i][j];
System.out.print(sum / 5);
}
}
*/
public class ArrayMCQ
{
public static void main(String args[])
{
/*int[] arr = {1, 2, 3, 4, 5};
System.out.println(arr[2]);*/
/*int[] arr = new int[5];
System.out.println(arr[0]);*/

/*int [ ] items = {2, 7, 3, 5, 8, 9};
int funny = items[0];
for (int i = 0; i < items.length; i++)
{
if (items[ i ] > funny)
funny = items[ i ];
}
System.out.print(funny);*/


/*int[][] matrix = { {1,1,2,2},{1,2,2,4},{1,2,3,4},{1,4,1,2}};
int sum = 0;
int col = matrix[0].length - 2;
for (int row = 0; row < 4; row++)
{
sum = sum + matrix[row][col];
}
System.out.println(sum);*/

/*int[] arr = new int[5];
for (int i = 0; i < arr.length; i++) {
arr[i] = i;
}
for (int i = 0; i < arr.length; i++) {
arr[i] = arr[i] * arr[i];
}
for (int num : arr) {
System.out.print(num + " ");
}
*/
/*
int[] arr = {1, 2, 3, 4, 5};
int sum = 0;
for (int i = 0; i < arr.length; i++) {
if (i % 2 == 0) {
sum += arr[i];
} else {
sum -= arr[i];
}
}
System.out.println(sum);
*/
/*
int[] arr = {1, 2, 3, 4, 5};
int product = 1;
for (int i = 0; i < arr.length; i++) {
product *= arr[i];
if (arr[i] % 2 == 0) {
continue;
}
product += arr[i];
}
System.out.println(product);
*/

/*
int[] arr = {0, 1, 2, 3, 4};
int sum = 0;
for (int i = 0; i < arr.length; i++) {
sum += arr[i];
if (sum > 5) {
break;
}
}
System.out.println(sum);
*/

int[][] arr = {
{1, 2},
{3, 4},
{5, 6}
};
for (int i = 0; i < arr.length; i++) {
for (int j = arr[i].length - 1; j >= 0; j--) {
System.out.print(arr[i][j] + " ");
}
System.out.println();
}


}
}

