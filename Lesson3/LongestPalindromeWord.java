// LongestPalindromeWord.java
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class LongestPalindromeWord
{
	public static void main(String[] args)
	{
		Scanner fileIn = null;
		try
		{
			fileIn = new Scanner(new FileInputStream("words.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
				
		String word;
		boolean palindrome;
		String longestPalindromeWord = "";
				
		while(fileIn.hasNext())
		{
			word = fileIn.next();			
			
			if(word.length() > longestPalindromeWord.length())
			{
				palindrome = true;
				
				for(int i = 0; i < word.length() / 2; i++)
				{
					if(word.charAt(i) != word.charAt(word.length() - 1 - i))
					{
						palindrome = false;
						break;
					}
				}
				
				if(palindrome == true)
				{
					longestPalindromeWord = word;					
				}
			}
		}		
		fileIn.close();
		
		System.out.println("Longest Palindrome Word: " + longestPalindromeWord);
	}
}