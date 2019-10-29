// Fraction.java
public class Fraction 
{
	private int numerator;
	private int denominator;
	
	public Fraction()
	{
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int newNumerator)
	{
		numerator = newNumerator;
		denominator = 1;
	}
	
	public Fraction(int newNumerator, int newDenominator)
	{
		setNumerator(newNumerator);
		setDenominator(newDenominator);
	}
	
	public void setNumerator(int newNumerator)
	{
		numerator = newNumerator;
	}
	
	public void setDenominator(int newDenominator)
	{
		if(newDenominator != 0)
			denominator = newDenominator;
		else
			denominator = 1;
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public double getFractionValue()
	{		
		return (double)numerator / denominator;
	}
	
	public String toString()
	{
		reduceFraction();
		return numerator + "/" + denominator;
	}
	
	public void printFraction()
	{
		reduceFraction();
		System.out.println(numerator + "/" + denominator);
	}
	
	private void reduceFraction() 
	{
		int n = numerator;
		int d = denominator;

		while (n != 0) 
		{
			int temp = n;
			n = d % n;
			d = temp;
		}

		numerator = numerator / d;
		denominator = denominator / d;
	}
}