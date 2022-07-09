package F1_CONDITIONAL_STATEMENTS;

public class a_ladder 
{
	public static void main(String[] args) 
	{
		double a=56.6;
		double b=78.6;
		double c=98.8;
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}	
		else if(a<b)
		{
			System.out.println("b is greater than a");
		}
		else if(a>c)
		{
			System.out.println("a is greater than c");
		}
		else if(a<c)
		{
			System.out.println("c is greater than c");
		}
		else if(b>c)
		{
			System.out.println("b is greater than c");
		}
		else
		{
			System.out.println("c is greater than b");
		}
	}
}
