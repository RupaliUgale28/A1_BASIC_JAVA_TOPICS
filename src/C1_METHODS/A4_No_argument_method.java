package C1_METHODS;

public class A4_No_argument_method 
{
	int a=100;//instance variable all
	int b=200;
	int c;
	
	public void m1()
	{
		int a=100;//local variable all
		int b=300;
		int c;		
		c=b/a;
		System.out.println("1)output of no argument method of division operation is = " +c);
	}
	
	public void m2()
	{
		c=b-a;
		System.out.print("2)output of no argument method of substraction operation is = " +c);		
	}
	
	public static void main(String[] args) 
	{	
		A4_No_argument_method nr=new A4_No_argument_method();
       nr.m1();
       nr.m2();
	}	
}
//no argument==no input/parameter passes in method
//
//
//