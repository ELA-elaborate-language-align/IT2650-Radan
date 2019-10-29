public class BeerSong {

	private int numberofBottles;

	BeerSong(int number) {
		if (number < 0)
			numberofBottles = 0;
		else if (number > 99)
			numberofBottles = 99;
		else
			numberofBottles = number;
	}

	public String getSingular(int i) {
		switch (i) {
		case 1:	return "One";
		case 2:	return "Two";
		case 3:	return "Three";
		case 4:	return "Four";
		case 5:	return "Five";
		case 6:	return "Six";
		case 7:	return "Seven";
		case 8:	return "Eight";
		case 9:	return "Nine";
		case 0:	return "Zero";
		default:return "Error";
		}
	}

	public String getMultiplesOfTen(int i) {
		switch (i) {
		case 2:	return "Twenty";
		case 3:	return "Thirty";
		case 4:	return "Forty";
		case 5:	return "Fifty";
		case 6:	return "Sixty";
		case 7:	return "Seventy";
		case 8:	return "Eighty";
		case 9:	return "Ninety";
		default: return "Error";
		}
	}

	public String getTeens(int i) {
		switch (i) {
		case 0:	return "Ten";
		case 1:	return "Eleven";
		case 2:	return "Twelve";
		case 3:	return "Thirteen";
		case 4:	return "Fourteen";
		case 5:	return "Fifteen";
		case 6:	return "Sixteen";
		case 7:	return "Seventeen";
		case 8:	return "Eighteen";
		case 9:	return "Nineteen";
		default:return "Error";
		}
	}

	public String getNumberInEnglish(int i) {

		int ones = i % 10;

		int tens = i / 10;

		if (i > 9) {
			if (tens == 1)

				return getTeens(ones);
			else if (ones == 0)

				return getMultiplesOfTen(i / 10);
			else

				return getMultiplesOfTen(tens) + '-' + getSingular(ones);
		} else
			return getSingular(ones);
	}

	public String printSong() {
		String bottleString = "bottles";
		
		//Output to store the song
		String Output = "";
		
		while (numberofBottles > 0) {

			if (numberofBottles == 1)
				bottleString = "bottle";
			
			Output = Output + getNumberInEnglish(numberofBottles) + " " + bottleString
					+ " of beer on the wall.\n";

			Output = Output + getNumberInEnglish(numberofBottles) + " " + bottleString
					+ " of beer on the wall,\n";

			
			Output = Output + "Take one down, pass it around,\n";

			numberofBottles = numberofBottles - 1;

			if (numberofBottles == 0)
				bottleString = "bottles";
			else if (numberofBottles == 1)
				bottleString = "bottle";

		
		}
        //When number of bottles is zero 
		Output = Output + "Zero bottles of beer on the wall."; 
		return Output;
	}
}
