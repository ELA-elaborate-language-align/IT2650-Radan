// YearlyDepreciation.java
import java.util.Scanner;
import java.text.DecimalFormat;
public class YearlyDepreciation
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		DecimalFormat pattern0dot00 = new DecimalFormat("0.00");
		
		System.out.print("Enter the purchase price of an item: ");
		double P = keyboard.nextDouble();
		
		System.out.print("Enter the expected number of years of service: ");
		double Y = keyboard.nextDouble();
		
		System.out.print("Enter the expected salvage value: ");
		double S = keyboard.nextDouble();
		
		double D = (P - S) / Y;
		
		System.out.println("\nThe yearly depreciation for the item: " 
								+ pattern0dot00.format(D));	
		
		keyboard.close();		
	}
}