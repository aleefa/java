import java.util.Scanner;
class Demo
{
void multiply(int a,int b)
{
System.out.println("Result is "+(a*b));
}
void multiply(int a,int b,int c)
{
System.out.println("Result is "+(a*b*c));
}
public static void main(String [] args)
{
Demo h = new Demo();
h.multiply(6,5);
h.multiply(4,3,2);
}
}

