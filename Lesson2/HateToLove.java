// HateToLove.java
import java.util.Scanner;
public class HateToLove
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a line of text.");
		String stringToBeReplaced = keyboard.nextLine();
		
		String replacedString = 
				stringToBeReplaced.replaceFirst("hate", "love");		
			
		System.out.println("I have rephrased that line to read:");
		System.out.println(replacedString);
		
		keyboard.close();
	}
}