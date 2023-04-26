package ch14;

public class Main {

	public static void main(String[] args) {
		
		Support a = new NoSupport("alice");
		Support b = new LimitSupport("bob", 10);
		Support c = new SpecialSupport("Chailie", 41);
		Support d = new LimitSupport("Diana", 20);
		Support e = new OddSupport("Elmo");
		Support f = new LimitSupport("Fred", 30);
		
		a.setNext(b).setNext(c).setNext(d).setNext(e).setNext(f);
		
		for(int i=0; i<50; i++) {
			a.support(new Trouble(i));
		}
		
	}
	
}
