import java.util.*;
class Matrix
{
public static void main(String[]args)
{
int row,col;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of rows for the matrices:");
row=sc.nextInt();
System.out.print("enter the number of columns for the matrices:");
col=sc.nextInt();
int[][] matrixA=new int[row][col];
int[][] matrixB=new int[row][col];
int[][] matrixSum=new int[row][col];
System.out.print("enter the elements for the matrix A:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
matrixA[i][j]=sc.nextInt();
}
}
System.out.println("\n");

System.out.print("enter the elements for the matrix B:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
matrixB[i][j]=sc.nextInt();
}
}
System.out.println("\n");
System.out.print("Matrix A is:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(matrixA[i][j]+" ");
}
System.out.println("\n");
}
System.out.print("Matrix B is:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(matrixB[i][j]+" ");
}
System.out.println("\n");
}
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
matrixSum[i][j]=matrixA[i][j]+matrixB[i][j];
}
}
System.out.print("Resultant of the matrix addition is:\n");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(matrixSum[i][j]+" ");
}
System.out.println("\n");
}
}
}



