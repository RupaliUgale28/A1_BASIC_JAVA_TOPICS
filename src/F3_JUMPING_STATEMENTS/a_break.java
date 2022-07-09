package F3_JUMPING_STATEMENTS;

public class a_break {

	public static void main(String[] args) 
	{
		for(int a=1;a<=10;a++)
		{
			if(a==8)
			{
				break;
			}
			System.out.println(a);
		}
		System.out.println("hello \nindia");
	}
}
//when break condition meets ..compiler directly returns to the main method
//it exits from the loop when condition meet.
//