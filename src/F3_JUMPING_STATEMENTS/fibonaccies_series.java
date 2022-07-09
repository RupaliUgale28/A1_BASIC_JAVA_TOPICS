package F3_JUMPING_STATEMENTS;

public class fibonaccies_series 
{
	
	public static void main(String[] args) 
	{
		//fibonaccies series== 0,1,1,2,3,5,8,13,21,44
		int x=0;
		int y=1;
		int z;
		System.out.print("fibonacci series = ");
		System.out.print(x+" ");
		System.out.print(y);
		for(int a=0;a<=10;a++)	
		{
			z=x+y;
			System.out.print(" " +z);
			x=y;//swaping operation
			y=z;
		}

	}

}
