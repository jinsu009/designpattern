package ch20;

public class BigString {

	private BigChar[] bigChars;
	
	//생성자
	public BigString(String str) {
		bigChars = new BigChar[str.length()];
		BigCharFactory factory  = BigCharFactory.getInstance();
		for(int i =0 ; i<bigChars.length; i++) {
			bigChars[i] = factory.getBigChar(str.charAt(i));
		}		
	}
	
	public void print() {
		for(int i =0; i<bigChars.length; i++) {
			bigChars[i].print();
		}
	}
	
}
