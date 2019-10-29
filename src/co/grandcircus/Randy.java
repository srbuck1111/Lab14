package co.grandcircus;

public class Randy extends Player{
	
	Randy() {
		super("Randy");
	}
	
	@Override
	public Roshambo generateRoshambo() {
		
		return getRoshambo((int) (Math.random() * 3));
		
	}

}
