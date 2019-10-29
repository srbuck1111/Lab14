package co.grandcircus;

import java.util.Scanner;

public class User extends Player {

	User(String name) {
		super(name);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		
		Scanner scan = new Scanner(System.in);
		
		String prompt = "1. Rock\n2. Paper\n3. Scissors\nChoice: ";
		int userChoice = Validator.getInt(scan, prompt);
		
		return getRoshambo(userChoice);
		
	}

}
