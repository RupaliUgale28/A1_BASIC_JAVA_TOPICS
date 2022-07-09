package F3_JUMPING_STATEMENTS;

public class swipe_task 
{
	public void m1()
	{
		int x=10;
		int y=20;
		int z=30;
		x=y;
		y=z;
		z=x;
	System.out.println("swaping of three variables= ");
		System.out.println("x= " +x);
		System.out.println("y= " +y);
		System.out.println("z= " +z);
	}

	public static void main(String[] args) 
	{
		swipe_task s=new swipe_task();
		s.m1();
		int a=10;
		int b=20;
		int c;	
		c=a;
		a=b;
		b=c;
		System.out.println("swaping of variables by taking third variable = ");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
	
	}
}
