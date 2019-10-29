// Messy.java
public class Messy
{
	public static final double DISTANCE = 6.21;

	public static void main(String[] args)
	{
		double time;
		double pace;

		System.out.println("This program calculates your pace given a time and distance traveled");
		
		time = 35.50; /* 35 minutes and 30 seconds */
		
		pace = time / DISTANCE;
		
		System.out.printf("Your pace is %.1f minutes per mile.", pace);
	}
}