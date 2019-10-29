package co.grandcircus;

public abstract class Player {

	private String name;

	Player() {
		name = null;
	}
	
	Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

	public static Roshambo getRoshambo(int i) {
		
		switch (i) {

		case 0:
			return Roshambo.ROCK;
		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.SCISSORS;
		default:
			return null;
			
		}
		
	}
	
	public String fight(Player player) {
		
		Roshambo p1R = generateRoshambo();
		Roshambo p2R = player.generateRoshambo();
		
		if (p1R == Roshambo.ROCK) {
			
			if(p2R == Roshambo.ROCK) {
				return "Tie!";
			} else if (p2R == Roshambo.PAPER) {
				return player.getName() + " wins!";
			} else {
				return getName() + " wins!";
			}
			
		} else if (p1R == Roshambo.PAPER) {
			
			if(p2R == Roshambo.ROCK) {
				return getName() + " wins!";
			} else if (p2R == Roshambo.PAPER) {
				return "Tie!";
			} else {
				return player.getName() + " wins!";
			}
			
		} else {
			if(p2R == Roshambo.ROCK) {
				return player.getName() + " wins!";
			} else if (p2R == Roshambo.PAPER) {
				return getName() + " wins!";
			} else {
				return "Tie!";
			}
			
		}
		
	}

}
