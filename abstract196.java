import java.util.Scanner;
import java.lang.Math;
abstract class Shape{
int a,b;
Shape(int x,int y)
{
a=x;b=y;
}
Shape(int x)
{
a=x;
}

abstract double printArea();

}//shape class
class Rectangle extends Shape{
Rectangle(int x,int y)
{
super(x,y);
}
double printArea()
{
return a*b;
}
}//rect class


class Triangle extends Shape{
Triangle(int x,int y)
{
super(x,y);
}
double printArea()
{
return 0.5*a*b;
}
}//triangle class


class Circle extends Shape{
Circle(int x,int y)
{
super(x,y);
}
Circle(int x)
{
super(x);
}
double printArea()
{
return Math.PI*Math.pow(a,2);
}
}//circle class

class A{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length and breadth of rectangle");

int p=sc.nextInt();
int q=sc.nextInt();
System.out.println("Enter base and height of triangle");

int e=sc.nextInt();
int w=sc.nextInt();

System.out.println("Enter radius of circle");
int r=sc.nextInt();


Rectangle r1=new Rectangle(p,q);
Triangle t1=new Triangle(e,w);
Circle c1=new Circle(r);
Shape s; //creating a reference 
s=r1;
double a1=s.printArea();
System.out.println("Area of rectangle is "+""+a1);
s=t1;
a1=s.printArea();
System.out.println("Area of triangle is "+""+a1);
s=c1;
a1=s.printArea();
System.out.println("Area of circle is "+""+a1);
}//main
}//class