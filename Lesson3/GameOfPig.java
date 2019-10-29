// GameOfPig.java
import java.util.Random;
import java.util.Scanner;
public class GameOfPig
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);

		int humanTotalScore = 0;
		int compTotalScore = 0;
		int compSubTotal = 0;
		boolean run = true;
		String response;
		int roll = 0;

		do
		{
			System.out.println("*** Human's Turn ***");
			run = true;
			do
			{
				roll = 1 + rand.nextInt(6);
				System.out.println("Human rolled " + roll + ".");

				if (roll == 1)
				{
					System.out.println("Human's score: " + humanTotalScore 
							+ " and Computer's score: " + compTotalScore);
					run = false;
				}
				else
				{
					humanTotalScore += roll;
					System.out.println("Human's score: " + humanTotalScore 
							+ " and Computer's score: " + compTotalScore);

					if (humanTotalScore >= 100)
					{
						run = false;
					}
					else
					{
						System.out.print("Enter 'r' to roll again or 'h' to hold: ");
						response = keyboard.next();
						if (response.equalsIgnoreCase("h"))
						{
							run = false;
						}
					}
				}
			} while (run);

			if (humanTotalScore < 100)
			{
				System.out.println("\n*** Computer's Turn ***");

				compSubTotal = 0;
				run = true;
				do
				{
					roll = 1 + rand.nextInt(6);
					System.out.println("Computer rolled " + roll + ".");

					if (roll == 1)
					{
						System.out.println("Human's score: " + humanTotalScore 
								+ " and Computer's score: " + compTotalScore);
						run = false;
					}
					else
					{
						compSubTotal += roll;
						compTotalScore += roll;
						System.out.println("Human's score: " + humanTotalScore 
								+ " and Computer's score: " + compTotalScore);

						if (compSubTotal >= 20)
						{
							System.out.println("Computer's subtotal >= 20.");
							run = false;
						}
						
						if (compTotalScore >= 100)
						{
							run = false;
						}
					}
				} while (run && compSubTotal < 20);
			}
			System.out.println();
		} while (humanTotalScore < 100 && compTotalScore < 100);

		if (humanTotalScore >= 100)
			System.out.println("Human wins the game!");
		else
			System.out.println("Computer wins the game!");

		keyboard.close();
	}
}