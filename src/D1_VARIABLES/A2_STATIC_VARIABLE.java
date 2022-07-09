package D1_VARIABLES;

public class A2_STATIC_VARIABLE 
{
	
	static int a=50;
	static int b=100;
	static int c;
	
	 public static void div1()
	{
		System.out.print("1)output of division by using static variable = ");
		c=a/b;
		System.out.println(c);
	}
	 
	 public void mul1()
	{
		System.out.print("2)output of division by using static variable = ");
		c=a*b;
		System.out.println(c);
	}
	 
	public static void main(String[] args) 
	{
		A2_STATIC_VARIABLE stat=new A2_STATIC_VARIABLE();
		stat.div1();// by creating reference variable of objectc=a+b;
		stat.mul1();
		//static_variables.mul1();//by using class name
		c=a-b;
		System.out.print("3)output from main method of substraction operation = ");;
		System.out.println(stat.c);//in main method we call by using== refvariableofobj.variablename
	}
	

}
