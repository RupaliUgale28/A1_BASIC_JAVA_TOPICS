package D1_VARIABLES;

public class A1_LOCAL_VARIABLE 
{
	public void sub()
	{
		int a=10;
		int b=20;
		int c;
		c=a-b;
		System.out.println("1)substraction of 2 local variables = " +c);
	}
	public static void div()
	{
		float a=33;
		float b=12;
		float c;
		c=b/a;
		System.out.println("2)division of 2 local variables = " +c);
	}
	
	public static void main(String[] args) 
	{
		double a=10.5;//local variable
		double b=20.5;//local variable
		double c;//local variable
		c=a+b;
		System.out.println("1)addition of 2 local variable a and b is c = " +c);
		
		A1_LOCAL_VARIABLE l=new A1_LOCAL_VARIABLE();//object creation
		l.sub();//calling sub method
		A1_LOCAL_VARIABLE.div();
	}
	

}
