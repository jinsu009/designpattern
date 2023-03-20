package ch4;

import ch4.framework.*;
import ch4.idcard.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory factory = new IDCardFactory();			
		
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("이순신");
		Product card3 = factory.create("이몽룡");

		card1.use();
		card2.use();
		card3.use();
	}

}
