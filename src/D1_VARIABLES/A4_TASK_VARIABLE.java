package D1_VARIABLES;

public class A4_TASK_VARIABLE 
{	
//local variable of char type in non static method
	public void m1()
	{
		char a='R';
		System.out.print("1)o/p of method m1 is char = ");
		System.out.println(a);
	}
	//use of local variable in non static method
	public void div()
	{
		double a=3.5;
		double b=4.7;
		double c;
		c=b/a;
		System.out.print("2)o/p of div method is = ");
		System.out.println(c);
	}
	//use of local variable in static method 
	public static void mul()
	{
		int a=12;
		int b=13;
		int c;
		c=a*b;
		System.out.print("3)o/p of mul method is = ");
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		A4_TASK_VARIABLE v=new A4_TASK_VARIABLE();
		v.m1();
		v.div();
		v.mul();
		
		int a=100;
		int b=200;
		int c;
		c=a+b;
		System.out.print("4)o/p of main method of addition is = " +c);
	}
}
