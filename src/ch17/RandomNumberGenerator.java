package ch17;

import java.util.Random;

// 관찰 되는 대상
public class RandomNumberGenerator extends NumberGenerator{

	private Random random = new Random();	
	private int number;
	public int getNumber() {
		return number;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		for(int i =0; i<20; i++) {
			number = random.nextInt(15);
			notifyObservers();
		}	
	}	
}
