package countriesApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesTextFile {
	static Scanner input = new Scanner (System.in);
	
	public static void addCountry() {
		Path countriesPath = Paths.get("countries.txt");
		File countriesFile = countriesPath.toFile();
		
		try {
			FileWriter out = new FileWriter(countriesFile,true);
			out.append(input.nextLine() + "\n");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readCountry(){
		Path countriesPath = Paths.get("countries.txt");
		File countriesFile = countriesPath.toFile();
		try {
		FileReader r = new FileReader(countriesFile);
		BufferedReader in = new BufferedReader( r);
		String line = in.readLine();
		while (line !=null)
		{
				System.out.println(line);
				line = in.readLine();
		}
		in.close();
		}
		catch (IOException e)
		{
		System.out.println(e);
		}
	}
}