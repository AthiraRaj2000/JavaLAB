import java.util.Scanner;
public class Area
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the circle radius:");
float ra=sc.nextInt();
System.out.println("enter the Square length:");
int sq=sc.nextInt();
System.out.println("enter the Rectangle length and breadth:");
int length=sc.nextInt();
int breadth=sc.nextInt();
Shape obj =new Shape();
obj.Area(ra);
obj.Area(sq);
obj.Area(length,breadth);
}
}
class Shape
{
void Area(float r)
{
double res=(r*r*3.14);
System.out.println("Area of the circle="+ res);
}
void Area (int len)
{
int res=(len*len);
System.out.println("Area of the Square="+ res);
}
void Area (int l,int b)
{
int res=l*b;
System.out.println("Area of the Rectangle="+ res);
}
}



