import java.util.*;
 class Array
{
public static void main(String[] args)
{
int n;
float total=0,percentage;
Scanner in=new Scanner(System.in);
System.out.print("Enter number of subjects:");
n=in.nextInt();
int marks[]=new int[n];
float s=(float)100/(n*100);
System.out.println("Enter marks out of 100:");
for(int i=0;i<n;i++)
{
marks[i]=in.nextInt();
total=total+marks[i];
}
percentage=(float)total*s;
System.out.println("sum:"+total);
System.out.println("percentage:"+percentage+ "%");
}
}




