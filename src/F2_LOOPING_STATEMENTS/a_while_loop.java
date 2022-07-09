package F2_LOOPING_STATEMENTS;

public class a_while_loop 
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=50;
		int c=1;
		int d=50;
		System.out.println("even number from 1 to 50");
		while(a<=50)
		{
			if(a%2==0)
			{
			System.out.print(" " +a);
			}
			a++;
		}
		System.out.println("");
		System.out.println("even number from 50 to 1");
		while(b>=1)
		{
			if(b%2==0)
			{
			System.out.print(" " +b);
			}
			b--;
		}
		
		System.out.println("");
		System.out.println("odd number from{"
				+ " 1 to 50");
		while(c<=50)
		{
			if(c%2!=0)
			{
			System.out.print(" " +c);
			}
			c++;
		}
		
		
		System.out.println("");
		System.out.println("odd number from 50 to 1");
		while(d>=1)
		{
			if(d%2!=0)
			{
			System.out.print(" " +d);
			}
			d--;
		}
		

	}

	

}
