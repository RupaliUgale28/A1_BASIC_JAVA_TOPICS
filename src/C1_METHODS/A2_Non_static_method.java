package C1_METHODS;

public class A2_Non_static_method 
{
	int a=100;//instance variable
	int b=200;
	int c;//can be used static variable in non static method
	
	public void add() //user defined non static method
	{
		c=a+b;
		System.out.print("1)Output of non-static method of addition operation = " +c);
	}
	
	public static void main(String[] args)//pre defined static method
	{
		A2_Non_static_method m=new A2_Non_static_method();//creating the object
		m.add();//calling add method
	}
}
//we can use static, instance and local variables in non static method
//