import java.util.Scanner;
public class AutomobileDemo
{

	public static void main(String[] args) 
	{
		double distance, mpg, gasPrice;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the distance in miles:");
		distance = scn.nextDouble();
		System.out.print("Enter rate of the car (mpg):");
		mpg = scn.nextDouble();
		System.out.print("Enter the cost of one gallon:");
		gasPrice = scn.nextDouble();
		System.out.println("Cost of the commute:" +(distance / mpg * gasPrice));
	}
}