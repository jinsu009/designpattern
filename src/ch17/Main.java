package ch17;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberGenerator generator = new RandomNumberGenerator();
		
		Observer obs1 = new DigitObserver();
		Observer obs2 = new GraphObserver();
		generator.addObserver(obs1);
		generator.addObserver(obs2);
		generator.execute();
	}

}
