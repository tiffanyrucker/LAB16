package countriesApp;

import java.util.Scanner;

public class countriesApp {

	public static void main(String[] args) {
		//variables
		int userInput = 0;
		
		//open Scanner
		Scanner input = new Scanner (System.in);
		
		//title
		System.out.println("Welcome to the Countries Maintance Application!" + "/n");
		
		//keepGoing
		String keepGoing= "y";
		//while to keepGoing
		while (keepGoing.equalsIgnoreCase("y")){
		//menu of options
		System.out.println("1-See the list of countries");
		System.out.println("2-Add a country");
		System.out.println("3-Exit");
		
		//user option
		userInput = input.nextInt();
		input.nextLine();
		
		switch(userInput){
		case 1:
				System.out.println();
				CountriesTextFile.readCountry();
				break;
		case 2:
				System.out.println();
				System.out.print("Enter a country to add to list: ");
				CountriesTextFile.addCountry();
				break;
		case 3:
			keepGoing= "n";
			break;
			}//end switch
		//empty line
		System.out.println();
		
		}//end keepGoing while
		System.out.println("Goodbye!!");
		input.close();
	}

}