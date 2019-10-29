// ThreeFinalists.java
import java.util.Random;
public class ThreeFinalists
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int num, finalist1 = 0, finalist2 = 0, finalist3 = 0;
		
		do
		{
			num = 1 + rand.nextInt(30);
			
			if(finalist1 == 0)
			{
				finalist1 = num;
			}
			else if(finalist2 == 0 && finalist1 != num)
			{
				finalist2 = num;
			}
			else if(finalist3 == 0 && finalist1 != num &&  finalist2 != num)
			{
				finalist3 = num;
			}
		}while(finalist1 == 0 || finalist2 == 0 || finalist3 == 0);
		
		System.out.println("Finalist #1: " + finalist1);
		System.out.println("Finalist #2: " + finalist2);
		System.out.println("Finalist #3: " + finalist3);
	}
}