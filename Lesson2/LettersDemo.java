import java.util.Scanner;

public class LettersDemo {
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		String textLine;
		System.out.print("Enter a line of text:");
		textLine = input.nextLine();
		System.out.println("Text in uppercase:"+textLine.toUpperCase());
		System.out.println("Text in lowercase:"+textLine.toLowerCase());
	}
}