package co.grandcircus;

public class Rocky extends Player {

	Rocky() {
		super("Rocky");
	}
	
	@Override
	public Roshambo generateRoshambo() {
		
		return getRoshambo(0);
		
	}

}
