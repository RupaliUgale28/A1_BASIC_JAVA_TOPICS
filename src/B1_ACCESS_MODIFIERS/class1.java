package B1_ACCESS_MODIFIERS;

public class class1 
{
	
		public String name="rahul";//public
		private String name1="rupali";//private
		String name2="saurabh";//default
		protected String name3="Pari";//protected


		public static void main(String[] args) 
		{
			class1 a1=new class1();
			System.out.println("Name= " +a1.name);//public***
			System.out.println("Name1= " +a1.name1);//private***
			System.out.println("Name2= " +a1.name2);//default***
			System.out.println("Name3= " +a1.name3);//protected***

		}


}
