package B2_ACCESS_MODIFIERS;

public class class3 extends class1 //create inheritance of cls1 to access protected variable+
{
	public static void main(String[] args) 
	{	
		class3 a3=new class3();//###
		System.out.println("Name= " +a3.name);//public***
		
	//	System.out.println("Name1= " +a3.name1);//private
		//System.out.println("Name2= " +a3.name2);//default
		
		System.out.println("Name3= " +a3.name3);//protected***###
	}
}
