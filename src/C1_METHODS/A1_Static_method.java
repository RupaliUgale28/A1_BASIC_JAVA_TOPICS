package C1_METHODS;

public class A1_Static_method 
{
	static int a=100;//all static/class variable
	static int b=200;
	static int c;
			
    static public void m1() 
	{
		c=a+b;
		System.out.println("1)Output of static method of Addition by way of calling ref variable of object name="+c);
	}
		    
    static public void m2()  
    {
    	c=a+b;
    	System.out.println("2)Output of static method of Addition by way of calling class name="+c);
    }
		    
   public static void main(String[] args) 
	{		
	   A1_Static_method m=new A1_Static_method(); 
        m.m1();//1st method to call non static method== refvblofobject.methodname();
        A1_Static_method.m2();//2nd way to call=== classname.methodname();
	}
} 
//2 ways to call static method=class name and reference of object.
//also called as class methods
//we can't use instance variable in static method
//
