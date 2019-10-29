// HateToLoveFile.java
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class HateToLoveFile
{	
	public static void main(String[] args)
	{
		Scanner fileIn = null;
		try
		{
			fileIn = new Scanner(new FileInputStream("hateText.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}

		System.out.println("Text left to read? " 
						+ fileIn.hasNextLine());
		String stringToBeReplaced = fileIn.nextLine();
		
		System.out.println("The line of text to be changed:");
		System.out.println(stringToBeReplaced);
		
		String replacedString = 
				stringToBeReplaced.replaceFirst("hate", "love");
		
		System.out.println("I have rephrased that line to read:");
		System.out.println(replacedString);

		fileIn.close();
	}
}