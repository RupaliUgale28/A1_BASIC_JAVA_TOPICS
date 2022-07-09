package F3_JUMPING_STATEMENTS;

public class a_return 
{
	public void m1()
	{
		System.out.println("####OUTPUT OF M1 METHOD");
		boolean b=true;
		boolean a=false;
		System.out.println("hi rupa");
		if(a)//a=false
		{
			return;
		}
		System.out.println("yess boss");
		for(int c=1;c<=10;c++)
		{
		if(b)//b= true
			{
				return;//returns to main method 
			}
			System.out.println("s");//does not print this statement
		}
		
	}
	
	public void m2()
	{
		System.out.println("#####OUTPUT OF M2 METHOD");

		for(int a=1;a<=5;a++)
		 {
			if(a==3)
			{
				return;
			}
			System.out.println(a);
			
		}
	}

	public static void main(String[] args) 
	{
		a_return r=new a_return();
		r.m1();
		r.m2();

		System.out.println("#####OUTPUT OF MAIN METHOD");

		int a=1;
		if(a==1)
		{
			System.out.println("***");
			return;
		}
		System.out.println("hellloooo");

	}

}
