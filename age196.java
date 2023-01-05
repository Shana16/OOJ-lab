import java.util.Scanner;
class WrongAge extends Exception {

public String toString() {

return "not valid ages";

}//toString

}//exception subclass



class Father {
int Father_age;

Father(int a)
{
Father_age=a;
}//constructor father

void check1() throws WrongAge
{
if(Father_age<0)
throw new WrongAge();
}//check1

}//father


class Son extends Father
{
int son_age;
Son(int a,int b) 
{
 super(a);
son_age=b;
}//son constructor

void check2() throws WrongAge{
    if(son_age>Father_age)
throw new WrongAge();
}//check2
        
}//son
class Age{
public static void main(String args[]) 
{ 
Scanner s=new Scanner(System.in);
System.out.println("Enter father and son age");
int f_age=s.nextInt();
int s_age=s.nextInt();
//Father k=new Father(f_age);
Son j=new Son(f_age,s_age);

try {
j.check1();
j.check2();

} 
catch (WrongAge e) {

System.out.println("Caught " + e);

}//catch

System.out.println("program end");
}//main

}//class for main