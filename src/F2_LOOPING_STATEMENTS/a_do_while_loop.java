//LOOPIMG STATEMENTS TYPES
package F2_LOOPING_STATEMENTS;

public class a_do_while_loop 
{
	public static void main(String[] args) {
		System.out.println("even number from 1 to 50 by do_while loop");
		int a=1;
		do{
			if(a%2==0)
			{
			System.out.print(a+" " );
			}
			a++;
		}while(a<=50);
		
		System.out.println("\n");

		System.out.println("even number from 50 to 1 by do_while loop");
		int b=50;
		do{
			if(b%2==0)
			{
				System.out.print(b+" ");
			}
			b--;
		}while(b>=1);
		
		System.out.println(" \n");

		System.out.println("odd number from 1 to 50 by do_while loop");
		int c=1;
		do{
			if(c%2!=0)
			{
				System.out.print(" " +c);
			}
			c++;
		}while(c<=50);
		
		System.out.println("\n");

		System.out.println("odd number from 50 to 1 by do_while loop");
		int d=50;
		do{
			if(d%2!=0)
			{
				System.out.print(" " +d);
			}
			d--;
		}while(d>=1);
	}
	
}