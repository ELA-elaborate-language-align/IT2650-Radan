// InterestCalculator.java
public class InterestCalculator
{
	private static final double COST_OF_STEREO_SYSTEM = 1000.00;
	private static final double INTEREST_RATE_PER_YEAR = 0.18;
	private static final double MONTHLY_PAYMENT = 50.00;

	public static void main(String[] args)
	{
		double debt = COST_OF_STEREO_SYSTEM;
		double interestRatePerMonth = INTEREST_RATE_PER_YEAR / 12;
		double interest = 0;
		double totalInterest = 0;
		double principal = 0;
		int numberOfMonths = 0;

		while (debt > 0)
		{
			interest = debt * interestRatePerMonth;

			if (debt >= MONTHLY_PAYMENT)
				principal = MONTHLY_PAYMENT - interest;
			else
				principal = debt;

			debt = debt - principal;

			numberOfMonths++;
			totalInterest += interest;
		}

		System.out.printf("Amount of loan: $%.2f\n",COST_OF_STEREO_SYSTEM);
		System.out.printf("Interest rate per year: %.2f%%\n", 
				                                (INTEREST_RATE_PER_YEAR * 100));
		System.out.printf("Monthly payment: $%.2f\n", MONTHLY_PAYMENT);
		System.out.println("Number of months needed to pay off the loan: " + numberOfMonths);
		System.out.printf("Total amount of interest paid over the life of the loan: $%.2f\n",
				                                                    totalInterest);
	}
}