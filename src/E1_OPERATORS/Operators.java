package E1_OPERATORS;

public class Operators 
{
	int a=100;
	int b=200;
	int c;
	public void m1()//arithmetic operations
	{
		int d;
		c=a*b;//multiplication
		System.out.println("1)Multiplication operation= " +c);
		d=b%a;//division
		System.out.println("2)Division operation= " +d);
	}
	
	public void m2()//assignment operators
	{
		int c=-b-300;//-=
		System.out.println("3)Assignment operation= " +c);
	}
	
	public static void main(String[] args) 
	{
		Operators o=new Operators();
		o.m1();
		o.m2();
	}
}
//
//
//
//