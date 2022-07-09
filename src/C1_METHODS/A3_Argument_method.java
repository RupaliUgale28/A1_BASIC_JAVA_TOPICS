package C1_METHODS;

public class A3_Argument_method 
{
	int a=100;
	int b=200;
	int c;
	
	public void mul1(int z)//first method
	{
	    c=a*b;
		System.out.print("1)output of argument method of multiplication\n  operation by instance variable = " +c);
	}
	
	public void mul2(int x,int y)//second method
	{
		int w;
		w=x*y;
		System.out.print("2)output of argument method of multiplication\n  operation by local variable = " +w);

	}
	
	public static void main(String[] args) //main method
	{
	A3_Argument_method ar=new A3_Argument_method();
       ar.mul1(10);//calling mul1 method
       ar.mul2(20,11);//calling mul2 method
	}
}
//passed input/parameter/argument in the method
//used non static method
//
//
//