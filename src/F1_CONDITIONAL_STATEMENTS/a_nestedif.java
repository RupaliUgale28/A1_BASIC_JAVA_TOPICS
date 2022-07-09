package F1_CONDITIONAL_STATEMENTS;

public class a_nestedif 
{
	public static void main(String[] args) 
	{
		int a=30;
		int b=20;
		int c=10;
		if(a>b)
		{
			System.out.println("a greater than b");
			if(a>c)
			{
				System.out.println("a greater than c");
			}
			else
			{
				System.out.println("c is greater than a" );

			}
		}
		
		else
		{
			System.out.println("b greater than a");

		}

	}
}

