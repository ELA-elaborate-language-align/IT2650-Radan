
//Class Sing with main method and uses BeerSong class:

import java.util.Scanner;

public class Sing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int numberOfBottles = sc.nextInt();

		BeerSong song = new BeerSong(numberOfBottles);

		System.out.print(song.printSong());

		sc.close();

	}

}