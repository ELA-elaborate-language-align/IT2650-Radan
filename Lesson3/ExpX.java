// ExpX.java
import java.util.Scanner;
public class ExpX
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);		
		int x;		
		int n;
		int k;
		double fact;
		double result;
		char repeat;
		
		do
		{		
			System.out.print("Enter a value of x: ");
			x = keyboard.nextInt();	
			
			result = 0;
			
			for (n = 0; n <= 100; n++)
			{			
				fact = 1;
				
				for (k = 1; n > 0 && k <= n; k++)
				{
					fact = fact * k;
				}	
				
				result += Math.pow(x, n) / fact;
				
				if((n >= 1 && n <= 10) || n == 50 || n == 100)
				{
					System.out.println("At n = " + n + ", e^" + x + " = " + result);
				}
			}
			
			System.out.print("\nEnter 'y' or 'Y' to repeat: ");
			repeat = keyboard.next().charAt(0);
			System.out.println();
		}while(repeat == 'y' || repeat == 'Y');
		
		keyboard.close();
	}
}