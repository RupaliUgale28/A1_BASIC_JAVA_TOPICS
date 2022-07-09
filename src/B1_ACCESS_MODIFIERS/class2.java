package B1_ACCESS_MODIFIERS;

public class class2 
{
	public static void main(String[] args) 
	{
		
		class1 a2=new class1();
		System.out.println("Name= " +a2.name);//public ***
	//	System.out.println("Name1= " +a2.name1);//private
		System.out.println("Name2= " +a2.name2);//default***
		System.out.println("Name3= " +a2.name3);//protected**	
	}

}
//here to access public and default variable=we create the object of that class where we initialize variable
//for protected we have to use child class concept of inheritance-and create object of that class onlyi.e. child class
//definition ===types
	


