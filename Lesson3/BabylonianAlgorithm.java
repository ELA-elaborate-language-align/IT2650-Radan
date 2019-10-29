// BabylonianAlgorithm.java
import java.util.Scanner;
public class BabylonianAlgorithm 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		double n;
		double guess;
		double r;
		double previousGuess;
		double diff;
		
		System.out.print("Enter a value for n: ");
		n = keyboard.nextDouble();
		
		guess = n / 2;
		
		do
		{
			r = n / guess;				
			previousGuess = guess;
			guess = (guess + r) / 2;
			diff = 	(previousGuess - guess) / (0.01 * previousGuess);		
		}while(diff > 0);
				
		System.out.printf(
			"The square root of %.2f is approximately: %.2f\n", n, guess);
		
		keyboard.close();
	}
}