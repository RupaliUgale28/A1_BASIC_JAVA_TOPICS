package D1_VARIABLES;

public class A3_INSTANCE_VARIABLE 
{	
	double a=34.2;
	double b=11.2;
	double c ;
	public void mul()
	{
		c=a*b;
		System.out.println("1)o/p of mul using instance variable is =" +c);
	}
	public void div()
	{
		c=b/a;
		System.out.println("2)o/p of div using instance variable is = " +c);
	}
	public void mod()
	{
		c=b%a;
		System.out.println("3)o/p of mod using instance variable is = " +c);
	}
	public static void main(String[] args) 
	{
		A3_INSTANCE_VARIABLE v=new A3_INSTANCE_VARIABLE();
		v.mul();
		v.div();
		v.mod();	
	}
}
