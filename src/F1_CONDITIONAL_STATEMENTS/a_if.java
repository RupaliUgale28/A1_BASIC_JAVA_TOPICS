package F1_CONDITIONAL_STATEMENTS;

public class a_if 
{
	public void m1()
	{
		double x=45.5;
		double y=23.5;
		
		if(x>y)
		{
			System.out.println("x is greater than y");
		}
		
		if(x<y)
		{
			System.out.println("y is greater than x");
		}
		
		if(x==y)
		{
			System.out.println("x and y are equal.");
		}
	}
	
	public static void main(String[] args) 
	{
		a_if i=new a_if();
		i.m1();//calling m1 method
		
		int a=323;
		int b=323;
		if(a>b)
		{
			System.out.println("ais greater than b");
			
		}
		
		if(a<b)
		{
			System.out.println("b is greater than a");
		}
		
		if(a==b)
		{
			System.out.println("a and b are equal.");
		}
	}
	


}