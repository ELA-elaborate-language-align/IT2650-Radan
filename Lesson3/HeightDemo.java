import java.util.Scanner;
public class HeightDemo 
{
	public static void main(String[] args) 
	{
		String genderChild, units, userChoice;
		int fatherHeight, motherHeight, childHeight;

		Scanner scn = new Scanner(System.in);
		while (true) 
		{
			fatherHeight = 0;
			motherHeight = 0;
			childHeight = 0;
			System.out.println("Enter your userChoice('boy' or 'girl'):");
			genderChild = scn.next();
			System.out.println("Enter 'feet' for feet  and inches,or 'inch' for inches:");
			units = scn.next();
			if (units.equals("feet")) 
			{
				System.out.println("Enter  father's height feet:");
				fatherHeight = 12 * scn.nextInt();
				System.out.println("Enter father's height inches:");
				fatherHeight += scn.nextInt();
				System.out.println("Enter mother's height feet:");
				motherHeight = 12 * scn.nextInt();
				System.out.println("Enter mother's height inches:");
				motherHeight += scn.nextInt();
			}
			else if (units.equals("inch")) 
			{
				System.out.println("Enter father's height inches:");
				fatherHeight = scn.nextInt();
				System.out.println("Enter mother's height inches:");
				motherHeight = scn.nextInt();
			}
		   if (genderChild.equals("boy")) 
			{
				childHeight = (int) (((motherHeight * 13 / 
						12.0)	+ fatherHeight) / 2.0);
			}
			else if (genderChild.equals("girl"))
			{
				childHeight = (int) (((fatherHeight + 12 
						/13.0)+ fatherHeight) / 2.0);
			}
			if (units.equals("feet")) 
			{
	System.out.println("The children will be"  
			+ " about " + childHeight / 12 + " feet, "+ childHeight % 12 + " inches tall.");
			}
			else if (units.equals("inch"))
			{
		System.out.println("The children will be about " + childHeight +" inches tall.");
			}
			System.out.println("Enter 'yes' to continue (or) 'no' to exit.");
			userChoice = scn.next();
			if (userChoice.equals("yes"))
				System.out.println("Continuing...");
			else if (userChoice.equals("no"))
				break;
		}		
	}
}