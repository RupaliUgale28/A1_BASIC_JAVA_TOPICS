package F1_CONDITIONAL_STATEMENTS;

public class a_ifelse 
{
	int x=500;
	int y=400;
	
	public void m1()//using instance variable
	{
		if(x>y)
		{
			System.out.println("x is greater than y");
		}
		else
		{
			System.out.println("x is not greater than y");
		}
	}
	public static void main(String[] args) 
	{
		a_ifelse i=new a_ifelse();
		i.m1();//calling m1 method
		
		//using local variable
		float  a=100;
		float b=200;
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("a is not greater than b");
		}

	}

}
