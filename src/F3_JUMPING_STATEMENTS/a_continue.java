package F3_JUMPING_STATEMENTS;

public class a_continue 
{
	public static void main(String[] args) 
	{
		for(int a=1;a<=10;a++)
		{
			if(a==7)
			{
				continue;
			}
			
			System.out.println(a);
		}
	}

}
//used for move our flow of execution to the next iteration.
//skip that particular iteration when condition meets.**********
//
