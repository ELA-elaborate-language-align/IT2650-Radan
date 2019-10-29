// CryptarithmeticPuzzle.java
public class CryptarithmeticPuzzle
{
	public static void main(String[] args)
	{	
		for (int T = 0; T <= 9; T++)
		{
			for (int O = 0; O <= 9; O++)
			{
				for (int G = 0; G <= 9; G++)
				{
					for (int D = 0; D <= 9; D++)
					{
						if (T != O && T != D && T != G && G != O && G != D && D != O)
						{
							int too = (100 * T) + (10 * O) + O;
							int good = (1000 * G) + (100 * O) + (10 * O) + D;
							
							if (4 * too == good)
							{
								System.out.println("TOO + TOO + TOO + TOO = " 
										+ (4 * too));
								System.out.println("GOOD = " + good);
								System.out.println("Therefore, T = " + T 
										+ ", O = " + O + ", G = " + G 
										+ ", and D = " + D);
								System.out.println();
							}
						}
					}

				}

			}

		}
	}
}