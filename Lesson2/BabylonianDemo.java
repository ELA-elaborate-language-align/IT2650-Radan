
// BabylonianDemo.java
import java.util.Scanner;
public class BabylonianDemo 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		double n;
		double guess;
		double r;
		
		System.out.print("Enter a value for n: ");
		n = keyboard.nextDouble();
		
		guess = n / 2;
		
		r = n / guess;			
		guess = (guess + r) / 2.0;
		
		r = n / guess;			
		guess = (guess + r) / 2.0;
		
		r = n / guess;			
		guess = (guess + r) / 2.0;
		
		r = n / guess;			
		guess = (guess + r) / 2.0;
		
		r = n / guess;			
		guess = (guess + r) / 2.0;
		
		System.out.printf(
			"The square root of %.2f is approximately: %.2f\n", n, guess);
	}
}