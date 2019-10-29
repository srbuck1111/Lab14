//Author: Sean Buck

package co.grandcircus;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String prompt = "What is your name?\n";
		String playerName = Validator.getString(scan, prompt);
		
		String ans = "Y";

		while (ans.equalsIgnoreCase("Y")) {

			Player player1 = new User(playerName);
			Player player2 = null;

			prompt = "Which player do you want to fight?\n1. Rocky\n2. Randy\nChoice: ";
			int choice = Validator.getInt(scan, prompt, 1, 2);

			switch (choice) {

			case 1:
				player2 = new Rocky();
				break;
			case 2:
				player2 = new Randy();
				break;
			default:
				System.out.println("stop.");
				
			}
			
			System.out.println(player1.fight(player2));

			System.out.println("Again? (Y/N)");
			ans = scan.nextLine();

		}

		scan.close();

	}

}
