package ch14;

public class Trouble {

	private int num;
	
	public Trouble(int number) {
		this.num = number;
	}
	public int getNumber() {
		return num;
	}
	public String toString() {
		return "{ Trouble : "+num+" }";
	}
	
}
